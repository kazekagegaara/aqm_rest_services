package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
				aqm.setSynced(rs.getString("synced"));
				aqm.setUserId(rs.getInt("user_id"));
				aqm.setDeviceId(rs.getInt("device_id"));
				aqm.setDateField(rs.getString("date_field"));
				aqm.setGeoLatitude(rs.getDouble("geo_latitude"));
				aqm.setGeoLongitude(rs.getDouble("geo_longitude"));
				aqm.setGeoMethod(rs.getString("geo_method"));
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

	public int insertAqmReading(LinkedList<AqmReadings> aqmList){
		int updatedRows = 0;
		Database database= new Database();
		Connection connection = database.Get_Connection();
		for(AqmReadings aqm : aqmList){
			String query = "insert into aqmreadings"
					+ "(id,largeValue,smallValue,"
					+ "synced,user_id,device_id,date_field,"
					+ "geo_latitude,geo_longitude,geo_method,"
					+ "createdAt) values(?,?,?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP)";
			
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1,aqm.getID());
				ps.setString(2, aqm.getLargeValue());
				ps.setString(3, aqm.getSmallValue());
				ps.setString(4, aqm.getSynced());
				ps.setInt(5, aqm.getUserId());
				ps.setInt(6, aqm.getDeviceId());
				ps.setString(7, aqm.getDateField());
				ps.setDouble(8, aqm.getGeoLatitude());
				ps.setDouble(9, aqm.getGeoLongitude());
				ps.setString(10, aqm.getGeoMethod());
				
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
