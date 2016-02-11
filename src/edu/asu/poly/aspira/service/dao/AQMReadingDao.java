package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.util.ArrayList;

import edu.asu.poly.aspira.service.model.AqmReadings;



public class AQMReadingDao {

	public ArrayList<AqmReadings> GetAqmReadingData(Connection connection){
		ArrayList<AqmReadings> aqmList = new ArrayList<AqmReadings>();
		
		return aqmList;
	}
	
	public int insertAqmReading(ArrayList<AqmReadings> aqmList){
		int updatedRows = 0;
		
		return updatedRows;
	}
	
}
