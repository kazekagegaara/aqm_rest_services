/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

import java.sql.Timestamp;

public class Sprioreading {

	private int id;
	private String reading;	
	private String synced;	
	private Timestamp timestamp;
	private String timeOfDay;
	private Timestamp createdAt;
	
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
		
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	public Timestamp getTimestamp() {
		return this.timestamp;
	}
	
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	
	public String getTimeOfDay() {
		return this.timeOfDay;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return this.createdAt;
	}
}
