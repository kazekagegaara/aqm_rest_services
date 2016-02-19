package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.LinkedList;

import edu.asu.poly.aspira.service.model.Sprioreading;

public class SpriorReadingDao {
	
	public ArrayList<Sprioreading> getspriorReadingData(){
		ArrayList<Sprioreading> spriorReadingList = new ArrayList<Sprioreading>();
		Database database= new Database();
		Connection connection = database.Get_Connection();
		try
		{
			String query = "SELECT * FROM sprioreading";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Sprioreading spiro = new Sprioreading();
				spiro.setID(rs.getInt("id"));
				spiro.setReading(rs.getString("reading"));
				spiro.setDeviceId(rs.getInt("device_id"));
				spiro.setTimestamp(rs.getTimestamp("timestamp").toString());
				spiro.setTimeOfDay(rs.getString("time_of_day"));
				spiro.setCreatedAt(rs.getString("createdAt"));
				spriorReadingList.add(spiro);
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
		return spriorReadingList;
	}
	
	public int insertSpriorReading(LinkedList<Sprioreading> spiroList){
		int updatedRows = 0;
		Database database= new Database();
		Connection connection = database.Get_Connection();
			String query = "insert into sprioreading"
					+ "(id,reading,device_id,"
					+ "timestamp,time_of_day) "
					+ "values(?,?,?,?,?)";
		for(Sprioreading spiro : spiroList) {	
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1,spiro.getID());
				ps.setString(2, spiro.getReading());
				ps.setInt(3, spiro.getDeviceId());
				Timestamp ts = new Timestamp(Long.parseLong(spiro.getTimestamp()));
				ps.setTimestamp(4, ts);
				ps.setString(5, spiro.getTimeOfDay());
				
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
