package edu.asu.poly.aspira.service.model;

import java.sql.Connection;
import java.util.ArrayList;

import edu.asu.poly.aspira.service.dao.Database;
import edu.asu.poly.aspira.service.dao.Project;
import edu.asu.poly.aspira.service.dto.FeedObjects;


public class ProjectManager {
	public ArrayList<FeedObjects> GetFeeds()throws Exception {
		ArrayList<FeedObjects> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		Project project= new Project();
		feeds=project.GetFeeds(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
}
