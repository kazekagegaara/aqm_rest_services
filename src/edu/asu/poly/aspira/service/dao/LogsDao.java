package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.asu.poly.aspira.service.model.AqmReadings;
import edu.asu.poly.aspira.service.model.Logs;

public class LogsDao {

	public ArrayList<Logs> GetLogsData(){
		ArrayList<Logs> logList = new ArrayList<Logs>();
		Database database= new Database();
		Connection connection = database.Get_Connection();
		try
		{
			String query = "SELECT * FROM logs";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Logs log = new Logs();
				log.setID(rs.getInt("id"));
				log.setType(rs.getString("type"));
				log.setSynced(rs.getString("synced"));
				log.setTimestamp(rs.getTimestamp("timestamp"));
				log.setExtras(rs.getString("extras"));
				log.setCreatedAt(rs.getTimestamp("createdAt"));
				logList.add(log);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logList;
	}
	
	public int insertLogs(ArrayList<Logs> logList){
		int updatedRows = 0;
		Database database= new Database();
		Connection connection = database.Get_Connection();
		for(Logs log : logList){
			String query = "insert into logs"
					+ "(id,type,synced,"
					+ "timestamp,extras,createdAt) "
					+ "values(?,?,?,?,?,systimestamp)";
			
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1,log.getID());
				ps.setString(2, log.getType());
				ps.setString(3, log.getSynced());
				ps.setTimestamp(4, log.getTimestamp());
				ps.setString(5, log.getExtras());
				
				int res = ps.executeUpdate();
				updatedRows = updatedRows + res;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return updatedRows;
	}
}
