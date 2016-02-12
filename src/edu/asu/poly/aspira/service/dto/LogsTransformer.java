/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import edu.asu.poly.aspira.service.model.Logs;
import edu.asu.poly.aspira.service.dao.LogsDao;

public class LogsTransformer {

	public int setLogs(String inputJSON) {
		// get String from service and convert to Model	
		// accepts String of format - {"logs":[{"_id":"","type":"","timestamp":"","synced":"","extras":""	}]}
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(inputJSON);
		String jsonInner = jsonObj.getAsJsonArray("aqmReadings").toString();
		ArrayList<Logs> models = gson.fromJson(jsonInner, new TypeToken<List<Logs>>(){}.getType());

		// pass model to DAO
		return setLogsFromDAO(models);
	}

	public String getLogs() {
		// make call to DAO
		List<Logs> result = getLogsFromDAO();

		// transform to JSON and return results
		Gson gson = new Gson();
		String json = gson.toJson(result);
		JsonObject j = new JsonObject();
		j.add("Logs",gson.toJsonTree(l));
		return j.getAsString();
	}

	private List<Logs> getLogsFromDAO() {		
		return new LogsDao().GetLogsData();		
	}

	private int setLogsFromDAO(ArrayList<Logs> models) {
		return new LogsDao().insertLogs(models);
	}
}
