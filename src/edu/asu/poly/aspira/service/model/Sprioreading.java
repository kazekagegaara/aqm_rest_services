/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class Sprioreading {

	private int id;
	private String reading;	
	private String synced;	
	private String timestamp;
	private String timeOfDay;
	private String createdAt;
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setReading(String reading) {
		this.reading = reading;
	}
	
	public String getReading() {
		return this.reading;
	}
	
	public void setSynced(String synced) {
		this.synced = synced;
	}
	
	public String getSynced() {
		return this.synced;
	}
		
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
	
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	
	public String getTimeOfDay() {
		return this.timeOfDay;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}
