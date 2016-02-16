/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.dto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import edu.asu.poly.aspira.service.model.AqmReadings;
import edu.asu.poly.aspira.service.model.Logs;
import edu.asu.poly.aspira.service.model.Sprioreading;
import edu.asu.poly.aspira.service.dao.AQMReadingDao;
import edu.asu.poly.aspira.service.dao.LogsDao;
import edu.asu.poly.aspira.service.dao.SpriorReadingDao;

public class AllDataTransformer {

	public int setAllData(String inputJSON) {
		// get String from service and convert to Model	
		// accepts String of format - {"sprioReading":[{"_id":"","reading":"","timestamp":"","synced":"","time_of_day":""	}]}
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(inputJSON);
		String jsonInner = jsonObj.getAsJsonArray("sprioReading").toString();
		ArrayList<Sprioreading> models = gson.fromJson(jsonInner, new TypeToken<List<Sprioreading>>(){}.getType());

		// pass model to DAO
		return setSprioreadingsFromDAO(models);
	}

	public String getAllData() {
		// make call to DAO
		List<Sprioreading> sprioreadingResult = getSprioreadingsFromDAO();
		List<Logs> logResult = getLogsFromDAO();
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

	private List<Sprioreading> getSprioreadingsFromDAO() {
		return new SpriorReadingDao().getspriorReadingData();
	}

	private int setSprioreadingsFromDAO(ArrayList<Sprioreading> models) {
		return new SpriorReadingDao().insertSpriorReading(models);
	}
	
	private List<Logs> getLogsFromDAO() {		
		return new LogsDao().GetLogsData();		
	}

	private int setLogsFromDAO(LinkedList<Logs> models) {
		return new LogsDao().insertLogs(models);
	}
	
	private List<AqmReadings> getAqmReadingsFromDAO() {
		return new AQMReadingDao().GetAqmReadingData();
	}
	
	private int setAqmReadingFromDAO(LinkedList<AqmReadings> models) {
		return new AQMReadingDao().insertAqmReading(models);
	}
}
