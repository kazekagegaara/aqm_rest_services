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
	@Path("/PingServer")
	@Produces("application/json")
	public String pingServer()
	{
		return "Ping Request Acknowledged";
	}
	
	@GET
	@Path("/GetAQMreading")
	@Produces("application/json")
	public String getAqmReading()
	{
		return aqmReadingsTransformer.getAqmReading();
	}

	@GET
	@Path("/GetUILogs")
	@Produces("application/json")
	public String getUILogs()
	{
		return logsTransformer.getLogs("uilogs");
	}
	@GET
	@Path("/GetErrorLogs")
	@Produces("application/json")
	public String getErrorLogs()
	{
		return logsTransformer.getLogs("errorlogs");
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
	public String postUILogs(String input)
	{
		// This method should accept JSON as input
		// logsTransformer.setLogs(input);
		int insertedRows = logsTransformer.setLogs(input);
		JsonObject j = new JsonObject();
		j.addProperty("success",insertedRows);
		return j.toString();
	}
//	@POST
//	@Path("/PostErrorLogs")
//	@Produces("application/json")
//	@Consumes("application/json")
//	public String postErrorLogs(String input)
//	{
//		// This method should accept JSON as input
//		// logsTransformer.setLogs(input);
//		int insertedRows = logsTransformer.setLogs(input);
//		JsonObject j = new JsonObject();
//		j.addProperty("success",insertedRows);
//		return j.toString();
//	}
	@POST
	@Path("/PostSprioReading")
	@Produces("application/json")
	@Consumes("application/json")
	public String postSprioReading(String input)
	{
		// This method should accept JSON as input
		// sprioreadingTransformer.setSprioreading(input);
		int insertedRows = sprioreadingTransformer.setSprioreading(input);
		JsonObject j = new JsonObject();
		j.addProperty("success",insertedRows);
		return j.toString();
	}
	@POST
	@Path("/PostAll")
	@Produces("application/json")
	@Consumes("application/json")
	public String postAll(String input)
	{
		// This method should accept JSON as input
		// TO-DO add another DTO class to handle "all" cases
		int insertedRows = allDataTransformer.setAllData(input);
		JsonObject j = new JsonObject();
		j.addProperty("success",insertedRows);
		return j.toString();
	}
}
