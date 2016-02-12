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

import edu.asu.poly.aspira.service.model.Sprioreading;
import edu.asu.poly.aspira.service.dao.SpriorReadingDao;

public class SprioreadingTransformer {

	public int setSprioreading(String inputJSON) {
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

	public String getSprioreading() {
		// make call to DAO
		List<Sprioreading> result = getSprioreadingsFromDAO();

		// transform to JSON and return results
		Gson gson = new Gson();
		String json = gson.toJson(result);
		JsonObject j = new JsonObject();
		j.add("Sprioreading",gson.toJsonTree(l));
		return j.getAsString();
	}

	private List<Sprioreading> getSprioreadingsFromDAO() {
		return new SpriorReadingDao().getspriorReadingData();
	}

	private int setSprioreadingsFromDAO(ArrayList<Sprioreading> models) {
		return new SpriorReadingDao().insertSpriorReading(models);
	}
}