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

import edu.asu.poly.aspira.service.model.Sprioreading;
import edu.asu.poly.aspira.service.dao.SpriorReadingDao;

public class SprioreadingTransformer {

	public int setSprioreading(String inputJSON) throws Exception {
		// get String from service and convert to Model		
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonArray jsonObj = (JsonArray) parser.parse(inputJSON);
		String jsonInner = jsonObj.toString();
		LinkedList<Sprioreading> models = gson.fromJson(jsonInner, new TypeToken<List<Sprioreading>>(){}.getType());

		// pass model to DAO
		return setSprioreadingsFromDAO(models);
	}

	public String getSprioreading() throws Exception {
		// make call to DAO
		List<Sprioreading> result = getSprioreadingsFromDAO();

		// transform to JSON and return results
		Gson gson = new Gson();		
		JsonArray jsArray = gson.toJsonTree(result).getAsJsonArray();			
		JsonObject j = new JsonObject();
		j.add("Sprioreading",jsArray);
		return j.toString();
	}

	private List<Sprioreading> getSprioreadingsFromDAO() throws Exception {
		return new SpriorReadingDao().getspriorReadingData();
	}

	private int setSprioreadingsFromDAO(LinkedList<Sprioreading> models) throws Exception {
		return new SpriorReadingDao().insertSpriorReading(models);
	}
}
