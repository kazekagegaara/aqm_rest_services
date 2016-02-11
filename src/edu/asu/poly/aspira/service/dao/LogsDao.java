package edu.asu.poly.aspira.service.dao;

import java.sql.Connection;
import java.util.ArrayList;

import edu.asu.poly.aspira.service.model.Logs;

public class LogsDao {

	public ArrayList<Logs> GetLogsData(Connection connection){
		ArrayList<Logs> logList = new ArrayList<Logs>();
		
		return logList;
	}
	
	public int insertLogs(ArrayList<Logs> logList){
		int updatedRows = 0;
		
		return updatedRows;
	}
}
