package edu.asu.poly.aspira.service.webServices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import edu.asu.poly.aspira.service.dto.AqmReadingsTransformer;
import edu.asu.poly.aspira.service.dto.LogsTransformer;
import edu.asu.poly.aspira.service.dto.SprioreadingTransformer;

@Path("/aspira")
public class AspiraServices {

	private AqmReadingsTransformer aqmReadingsTransformer = new AqmReadingsTransformer();
	private LogsTransformer logsTransformer = new LogsTransformer();
	private SprioreadingTransformer sprioreadingTransformer = new SprioreadingTransformer();


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
		String aqmReadings = aqmReadingsTransformer.getAqmReading();
		String logs = logsTransformer.getLogs();
		String sprioReadings = sprioreadingTransformer.getSprioreading();
		// TO-DO add another DTO class to handle "all" cases
		// TO-DO need to merge the three JSON from above three strings in the new DTO class 
		String feeds = "This is Get all";
		return feeds;
	}

	@POST
	@Path("/PostAQMreading")
	@Produces("application/json")
	@Consumes("text/plain")
	public String postAqmReading()
	{
		// This method should accept JSON as input
		// aqmReadingsTransformer.setAqmReading(input);
		String feeds = "This is Post AQM Reading";
		return feeds;
	}

	@POST
	@Path("/PostLogs")
	@Produces("application/json")
	public String postLogs()
	{
		// This method should accept JSON as input
		// logsTransformer.setLogs(input);
		String feeds = "This is Post Log";
		return feeds;
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
