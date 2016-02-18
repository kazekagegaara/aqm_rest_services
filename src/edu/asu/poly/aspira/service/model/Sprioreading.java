/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class Sprioreading {

	private int _id;
	private String reading;	
	private int device_id;	
	private String timestamp;
	private String time_of_day;
	private String createdAt;
	
	public void setID(int id) {
		this._id = id;
	}
	
	public int getID() {
		return this._id;
	}
	
	public void setReading(String reading) {
		this.reading = reading;
	}
	
	public String getReading() {
		return this.reading;
	}
	
	public void setDeviceId(int device_id) {
		this.device_id = device_id;
	}
	
	public int getDeviceId() {
		return this.device_id;
	}
		
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
	
	public void setTimeOfDay(String timeOfDay) {
		this.time_of_day = timeOfDay;
	}
	
	public String getTimeOfDay() {
		return this.time_of_day;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}
