/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class AqmReadings {

	private int _id;
	private String largeParticle;
	private String smallParticle;
	private int deviceId;
	private String dateTime;
	private String createdAt;
	
	public void setID(int id) {
		this._id = id;
	}
	
	public int getID() {
		return this._id;
	}
	
	public void setLargeValue(String largeValue) {
		this.largeParticle = largeValue;
	}
	
	public String getLargeValue() {
		return this.largeParticle;
	}

	public void setSmallValue(String smallValue) {
		this.smallParticle = smallValue;
	}
	
	public String getSmallValue() {
		return this.smallParticle;
	}
	
	public void setDeviceId(int device_id) {
		this.deviceId = device_id;
	}
	
	public int getDeviceId() {
		return this.deviceId;
	}
	
	public void setDateField(String date_field) {
		this.dateTime = date_field;
	}
	
	public String getDateField() {
		return this.dateTime;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}