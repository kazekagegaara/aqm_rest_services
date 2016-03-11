/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.dto;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import edu.asu.poly.aspira.service.model.AqmReadings;
import edu.asu.poly.aspira.service.model.Logs;
import edu.asu.poly.aspira.service.model.Sprioreading;
import edu.asu.poly.aspira.service.dao.AQMReadingDao;
import edu.asu.poly.aspira.service.dao.LogsDao;
import edu.asu.poly.aspira.service.dao.SpriorReadingDao;

public class AllDataTransformer {

	public String getAllData() throws Exception {
		// make call to DAO
		List<Sprioreading> sprioreadingResult = getSprioreadingsFromDAO();
		List<Logs> logResult = getLogsFromDAO("uilogs","0");
		logResult.addAll(getLogsFromDAO("errorlogs","0"));
		List<AqmReadings> aqmReadingsResult = getAqmReadingsFromDAO();

		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray spriorReadingArray = gson.toJsonTree(sprioreadingResult).getAsJsonArray();			
		JsonArray logArray = gson.toJsonTree(logResult).getAsJsonArray();
		JsonArray aqmReadingArray = gson.toJsonTree(aqmReadingsResult).getAsJsonArray();
		JsonObject j = new JsonObject();
		j.add("Sprioreading",spriorReadingArray);
		j.add("Logs",logArray);
		j.add("AqmReadings",aqmReadingArray);
		return j.toString();
	}

	private List<Sprioreading> getSprioreadingsFromDAO() throws Exception {
		return new SpriorReadingDao().getspriorReadingData("0");
	}
	
	private List<Logs> getLogsFromDAO(String tableName, String offset) throws Exception {		
		return new LogsDao().GetLogsData(tableName, offset);		
	}

	
	private List<AqmReadings> getAqmReadingsFromDAO() throws Exception {
		return new AQMReadingDao().GetAqmReadingData("0");
	}

}
