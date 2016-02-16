package edu.asu.poly.aspira.service.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.ws.rs.Consumes;

import edu.asu.poly.aspira.service.constants.Constants;

public class Database {
	public Connection Get_Connection(){
		Connection con = null;
		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return null;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		String dbUrl = null;
		String dbPort = null;
		String dbName = null;
		String dbUser = null;
		String dbPwd = null;
		String connectionURL = null;
		
			dbUrl = Constants.getDbUrl();
			dbPort = Constants.getDbPort();
			dbName = Constants.getDbName();
			dbUser = Constants.getDbUser();
			dbPwd = Constants.getDbPwd();
			connectionURL = "jdbc:mysql://"+dbUrl+":"+dbPort+"/"+dbName;
			
		try {
			con = DriverManager.getConnection(connectionURL,dbUser, dbPwd);
//			con = DriverManager.getConnection("jdbc:mysql://locahost:3306/aspira","dbuser", "root123");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;
		}

		if (con != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}

		return con;
	}
	public static void main(String[] argv) {
Database obj = new Database();
obj.Get_Connection();
			  }
}

