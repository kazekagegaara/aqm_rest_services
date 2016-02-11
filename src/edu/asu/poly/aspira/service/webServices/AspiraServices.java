package edu.asu.poly.aspira.service.webServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



@Path("/aspira")
public class AspiraServices {

	@GET
	@Path("/GetAQMreading")
	@Produces("application/json")
	public String getAqmReading()
	{
		String feeds = "This is Get AQM Reading";
		return feeds;
	}
	
	@GET
	@Path("/GetLogs")
	@Produces("application/json")
	public String getLogs()
	{
		String feeds = "This is Get Log";
		return feeds;
	}
	
	@GET
	@Path("/GetSprioReading")
	@Produces("application/json")
	public String getSprioReading()
	{
		String feeds = "This is Get Sprio Reading";
		return feeds;
	}

	@GET
	@Path("/GetAll")
	@Produces("application/json")
	public String getAll()
	{
		String feeds = "This is Get all";
		return feeds;
	}
	
	@POST
	@Path("/PostAQMreading")
	@Produces("application/json")
	@Consumes("text/plain")
	public String postAqmReading()
	{
		String feeds = "This is Post AQM Reading";
		return feeds;
	}
	
	@POST
	@Path("/PostLogs")
	@Produces("application/json")
	public String postLogs()
	{
		String feeds = "This is Post Log";
		return feeds;
	}
	@POST
	@Path("/PostSprioReading")
	@Produces("application/json")
	public String postSprioReading()
	{
		String feeds = "This is Post Sprio Reading";
		return feeds;
	}
	@POST
	@Path("/PostAll")
	@Produces("application/json")
	public String postAll()
	{
		String feeds = "This is post all";
		return feeds;
	}
}
