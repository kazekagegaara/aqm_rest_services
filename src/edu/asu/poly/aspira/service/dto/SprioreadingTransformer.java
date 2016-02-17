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

import edu.asu.poly.aspira.service.model.Sprioreading;
import edu.asu.poly.aspira.service.dao.SpriorReadingDao;

public class SprioreadingTransformer {

	public int setSprioreading(String inputJSON) {
		// get String from service and convert to Model	
		// accepts String of format - {"sprioReading":[{"_id":"","reading":"","timestamp":"","synced":"","time_of_day":""	}]}
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(inputJSON);
		String jsonInner = jsonObj.toString();
		Sprioreading model = gson.fromJson(jsonInner, Sprioreading.class);

		// pass model to DAO
		return setSprioreadingsFromDAO(model);
	}

	public String getSprioreading() {
		// make call to DAO
		List<Sprioreading> result = getSprioreadingsFromDAO();

		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray jsArray = gson.toJsonTree(result).getAsJsonArray();			
		JsonObject j = new JsonObject();
		j.add("Sprioreading",jsArray);
		return j.toString();
	}

	private List<Sprioreading> getSprioreadingsFromDAO() {
		return new SpriorReadingDao().getspriorReadingData();
	}

	private int setSprioreadingsFromDAO(Sprioreading model) {
		return new SpriorReadingDao().insertSpriorReading(model);
	}
}
