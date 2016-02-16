package edu.asu.poly.aspira.service.webServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.JsonObject;

import edu.asu.poly.aspira.service.dto.AqmReadingsTransformer;
import edu.asu.poly.aspira.service.dto.LogsTransformer;
import edu.asu.poly.aspira.service.dto.SprioreadingTransformer;
import edu.asu.poly.aspira.service.dto.AllDataTransformer;

@Path("/aspira")
public class AspiraServices {

	private AqmReadingsTransformer aqmReadingsTransformer = new AqmReadingsTransformer();
	private LogsTransformer logsTransformer = new LogsTransformer();
	private SprioreadingTransformer sprioreadingTransformer = new SprioreadingTransformer();
	private AllDataTransformer allDataTransformer = new AllDataTransformer();


	@GET
	@Path("/GetAQMreading")
	@Produces("application/json")
	public String getAqmReading()
	{
		return aqmReadingsTransformer.getAqmReading();
	}

	@GET
	@Path("/GetLogs")
	@Produces("application/json")
	public String getLogs()
	{
		return logsTransformer.getLogs();
	}

	@GET
	@Path("/GetSprioReading")
	@Produces("application/json")
	public String getSprioReading()
	{
		return sprioreadingTransformer.getSprioreading();
	}

	@GET
	@Path("/GetAll")
	@Produces("application/json")
	public String getAll()
	{		
		return allDataTransformer.getAllData();		
	}

	@POST
	@Path("/PostAQMreading")
	@Produces("application/json")
	@Consumes("application/json")
	public String postAqmReading(String input)
	{
		// This method should accept JSON as input
		int insertedRows = aqmReadingsTransformer.setAqmReading(input);
		JsonObject j = new JsonObject();
		j.addProperty("success",insertedRows);
		return j.toString();
	}

	@POST
	@Path("/PostLogs")
	@Produces("application/json")
	@Consumes("application/json")
	public String postLogs(String input)
	{
		// This method should accept JSON as input
		// logsTransformer.setLogs(input);
		int insertedRows = logsTransformer.setLogs(input);
		JsonObject j = new JsonObject();
		j.addProperty("success",insertedRows);
		return j.toString();
	}
	@POST
	@Path("/PostSprioReading")
	@Produces("application/json")
	public String postSprioReading()
	{
		// This method should accept JSON as input
		// sprioreadingTransformer.setSprioreading(input);
		String feeds = "This is Post Sprio Reading";
		return feeds;
	}
	@POST
	@Path("/PostAll")
	@Produces("application/json")
	public String postAll()
	{
		// This method should accept JSON as input
		// TO-DO add another DTO class to handle "all" cases
		String feeds = "This is post all";
		return feeds;
	}
}
