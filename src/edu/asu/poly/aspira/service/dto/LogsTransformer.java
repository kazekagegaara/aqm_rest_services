/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.dto;

import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import edu.asu.poly.aspira.service.model.Logs;
import edu.asu.poly.aspira.service.dao.LogsDao;

public class LogsTransformer {

	public int setLogs(String inputJSON) throws Exception {
		// get String from service and convert to Model			
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jsonObj = (JsonArray) parser.parse(inputJSON);		
		String jsonInner = jsonObj.toString();
		LinkedList<Logs> models = gson.fromJson(jsonInner,new TypeToken<List<Logs>>(){}.getType());

		// pass model to DAO
		return setLogsFromDAO(models);
	}

	public String getLogs(String tableName) throws Exception {
		// make call to DAO
		List<Logs> result = getLogsFromDAO(tableName);

		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray jsArray = gson.toJsonTree(result).getAsJsonArray();			
		JsonObject j = new JsonObject();
		j.add("Logs",jsArray);
		return j.toString();
	}

	private List<Logs> getLogsFromDAO(String tableName) throws Exception {		
		return new LogsDao().GetLogsData(tableName);		
	}

	private int setLogsFromDAO(LinkedList<Logs> models) throws Exception {
		return new LogsDao().insertLogs(models);
	}
}
