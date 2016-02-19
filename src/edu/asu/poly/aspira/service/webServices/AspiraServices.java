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
		String response = "";
		try {
			response = aqmReadingsTransformer.getAqmReading(); 
		} catch(Exception e) {
			JsonObject j = new JsonObject();
			j.addProperty("Error",e.getMessage());
			response = j.toString();
		}
		return response; 
	}

	@GET
	@Path("/GetUILogs")
	@Produces("application/json")
	public String getUILogs()
	{
		String response = "";
		try {
			response = logsTransformer.getLogs("uilogs");
		} catch(Exception e) {
			JsonObject j = new JsonObject();
			j.addProperty("Error",e.getMessage());
			response = j.toString();
		}
		return response;		
	}
	@GET
	@Path("/GetErrorLogs")
	@Produces("application/json")
	public String getErrorLogs()
	{
		String response = "";
		try {
			response = logsTransformer.getLogs("errorlogs");
		} catch(Exception e) {
			JsonObject j = new JsonObject();
			j.addProperty("Error",e.getMessage());
			response = j.toString();
		}
		return response;		
	}

	@GET
	@Path("/GetSprioReading")
	@Produces("application/json")
	
	public String getSprioReading()
	{
		String response = "";
		try {
			response = sprioreadingTransformer.getSprioreading();
		} catch(Exception e) {
			JsonObject j = new JsonObject();
			j.addProperty("Error",e.getMessage());
			response = j.toString();
		}
		return response;		
	}

	@GET
	@Path("/GetAll")
	@Produces("application/json")
	public String getAll()
	{	
		String response = "";
		try {
			response = allDataTransformer.getAllData();
		} catch(Exception e) {
			JsonObject j = new JsonObject();
			j.addProperty("Error",e.getMessage());
			response = j.toString();
		}
		return response;		
	}

	@POST
	@Path("/PostAQMreading")
	@Produces("application/json")
	@Consumes("application/json")
	public String postAqmReading(String input)
	{
		int insertedRows = 0;
		JsonObject j = new JsonObject();
		try {
			insertedRows = aqmReadingsTransformer.setAqmReading(input);
			if(insertedRows > 0) {
				j.addProperty("success",insertedRows);
			} else {
				j.addProperty("Error", "Unable to store AqmReading values");
			}				
		} catch(Exception e) {
			j.addProperty("Error", e.getMessage());
		}		
		return j.toString();
	}

	@POST
	@Path("/PostLogs")
	@Produces("application/json")
	@Consumes("application/json")
	public String postUILogs(String input)
	{
		int insertedRows = 0;
		JsonObject j = new JsonObject();
		try {
			insertedRows = logsTransformer.setLogs(input);
			if(insertedRows > 0) {
				j.addProperty("success",insertedRows);
			} else {
				j.addProperty("Error", "Unable to store logs");
			}
		} catch(Exception e) {
			j.addProperty("Error", e.getMessage());
		}		
		return j.toString();
	}

	@POST
	@Path("/PostSprioReading")
	@Produces("application/json")
	@Consumes("application/json")
	public String postSprioReading(String input)
	{
		int insertedRows = 0;
		JsonObject j = new JsonObject();
		try {
			insertedRows = sprioreadingTransformer.setSprioreading(input);
			if(insertedRows > 0) {
				j.addProperty("success",insertedRows);
			} else {
				j.addProperty("Error", "Unable to sprio readings");
			}
		} catch(Exception e) {
			j.addProperty("Error", e.getMessage());
		}		
		return j.toString();		
	}

}
