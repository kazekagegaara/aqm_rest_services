/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.dto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import edu.asu.poly.aspira.service.model.AqmReadings;
import edu.asu.poly.aspira.service.dao.AQMReadingDao;

public class AqmReadingsTransformer {

	public int setAqmReading(String inputJSON) {
		// get String from service and convert to Model	
		// accepts String of format - {"aqmReadings":[{"id":"","largeValue":"","smallValue":"","synced":"","user_id":"","device_id":"","date_field":"","geo_latitude":"","geo_longitude":"","geo_method":""	}]}
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(inputJSON);
		String jsonInner = jsonObj.getAsJsonArray("aqmReadings").toString();
		LinkedList<AqmReadings> models = gson.fromJson(jsonInner, new TypeToken<List<AqmReadings>>(){}.getType());
				
		// pass model to DAO
		return setAqmReadingFromDAO(models);
	}
	
	public String getAqmReading() {
		// make call to DAO
		List<AqmReadings> result = getAqmReadingsFromDAO();
		
		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray jsArray = gson.toJsonTree(result).getAsJsonArray();			
		JsonObject j = new JsonObject();
		j.add("AqmReadings",jsArray);
		return j.toString();		
	}
	
	private List<AqmReadings> getAqmReadingsFromDAO() {
		return new AQMReadingDao().GetAqmReadingData();
	}
	
	private int setAqmReadingFromDAO(LinkedList<AqmReadings> models) {
		return new AQMReadingDao().insertAqmReading(models);
	}
}
