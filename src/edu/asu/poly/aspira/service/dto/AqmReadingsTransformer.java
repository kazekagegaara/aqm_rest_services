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

import edu.asu.poly.aspira.service.model.AqmReadings;
import edu.asu.poly.aspira.service.dao.AQMReadingDao;

public class AqmReadingsTransformer {

	public int setAqmReading(String inputJSON) throws Exception {
		// get String from service and convert to Model	
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jsonObj = (JsonArray) parser.parse(inputJSON);
		String jsonInner = jsonObj.toString();
		LinkedList<AqmReadings> models = gson.fromJson(jsonInner, new TypeToken<List<AqmReadings>>(){}.getType());
				
		// pass model to DAO
		return setAqmReadingFromDAO(models);
	}
	
	public String getAqmReading() throws Exception {
		// make call to DAO
		List<AqmReadings> result = getAqmReadingsFromDAO();
		
		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray jsArray = gson.toJsonTree(result).getAsJsonArray();			
		JsonObject j = new JsonObject();
		j.add("AqmReadings",jsArray);
		return j.toString();		
	}
	
	private List<AqmReadings> getAqmReadingsFromDAO() throws Exception {
		return new AQMReadingDao().GetAqmReadingData();
	}
	
	private int setAqmReadingFromDAO(LinkedList<AqmReadings> models) throws Exception {
		return new AQMReadingDao().insertAqmReading(models);
	}
}
