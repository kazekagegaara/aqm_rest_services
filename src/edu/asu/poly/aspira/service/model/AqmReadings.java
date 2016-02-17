/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class AqmReadings {

	private int id;
	private String largeValue;
	private String smallValue;
	private int device_id;
	private String date_field;
	private String createdAt;
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setLargeValue(String largeValue) {
		this.largeValue = largeValue;
	}
	
	public String getLargeValue() {
		return this.largeValue;
	}

	public void setSmallValue(String smallValue) {
		this.smallValue = smallValue;
	}
	
	public String getSmallValue() {
		return this.smallValue;
	}
	
	public void setDeviceId(int device_id) {
		this.device_id = device_id;
	}
	
	public int getDeviceId() {
		return this.device_id;
	}
	
	public void setDateField(String date_field) {
		this.date_field = date_field;
	}
	
	public String getDateField() {
		return this.date_field;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}