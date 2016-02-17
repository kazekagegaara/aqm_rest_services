package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;

import edu.asu.poly.aspira.service.model.AqmReadings;
public class AQMReadingDao {

	public ArrayList<AqmReadings> GetAqmReadingData(){
		Database database= new Database();
		Connection connection = database.Get_Connection();
		ArrayList<AqmReadings> aqmList = new ArrayList<AqmReadings>();
		try
		{
			String query = "SELECT * FROM aqmreadings";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				AqmReadings aqm = new AqmReadings();
				aqm.setID(rs.getInt("id"));
				aqm.setLargeValue(rs.getString("largeValue"));
				aqm.setSmallValue(rs.getString("smallValue"));
				aqm.setDeviceId(rs.getInt("device_id"));
				aqm.setDateField(rs.getTimestamp("date_field").toString());
				aqm.setCreatedAt(rs.getString("createdAt"));
				aqmList.add(aqm);
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
		return aqmList;
	}

	public int insertAqmReading(AqmReadings aqm){
		int updatedRows = 0;
		Database database= new Database();
		Connection connection = database.Get_Connection();
			String query = "insert into aqmreadings"
					+ "(id,largeValue,smallValue,"
					+ "device_id,date_field) values(?,?,?,?,?)";
			
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1,aqm.getID());
				ps.setString(2, aqm.getLargeValue());
				ps.setString(3, aqm.getSmallValue());
				ps.setInt(4, aqm.getDeviceId());
				Timestamp ts = new Timestamp(Long.parseLong(aqm.getDateField()));
				ps.setTimestamp(5, ts);			
				int res = ps.executeUpdate();
				updatedRows = updatedRows + res;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
