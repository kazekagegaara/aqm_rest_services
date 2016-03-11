package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;

import edu.asu.poly.aspira.service.model.Logs;

public class LogsDao {

	public ArrayList<Logs> GetLogsData(String tableName, String offset) throws Exception{
		ArrayList<Logs> logList = new ArrayList<Logs>();
		Database database= new Database();
		Connection connection = database.Get_Connection();
		try
		{
			String query = "SELECT * FROM "+tableName+" limit 50 offset "+offset;
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Logs log = new Logs();
				log.setID(rs.getInt("id"));
				log.setType(rs.getString("type"));
				log.setTypeCode(rs.getString("typecode"));
				log.setTimestamp(rs.getTimestamp("timestamp").toString());
				log.setExtras(rs.getString("extras"));
				log.setCreatedAt(rs.getString("createdAt"));
				log.setDevice_id(rs.getInt("device_id"));
				logList.add(log);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		return logList;
	}

	public int insertLogs(LinkedList<Logs> logs) throws Exception{
		int updatedRows = 0;
		Database database= new Database();
		Connection connection = database.Get_Connection();

		for(Logs log : logs) {
			String tableName = "";
			System.out.println(log.getType());
			if(log.getType().equals("UI")){
				tableName = "uilogs";
			}else{
				tableName = "errorlogs";
			}
			String query = "insert into "+ tableName
					+ " (id,type,typecode,"
					+ "timestamp,extras,device_id) "
					+ "values(?,?,?,?,?,?)";

			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1,log.getID());
				ps.setString(2, log.getType());
				ps.setString(3, log.getTypeCode());
				Timestamp ts = new Timestamp(Long.parseLong(log.getTimestamp()));
				ps.setTimestamp(4, ts);
				ps.setString(5, log.getExtras());
				ps.setInt(6, log.getDevice_id());

				int res = ps.executeUpdate();
				updatedRows = updatedRows + res;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}

		}	

		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		return updatedRows;
	}
}
