/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class AqmReadings {

	private int id;
	private String largeValue;
	private String smallValue;
	private String synced;
	private int user_id;
	private int device_id;
	private String date_field;
	private long geo_latitude;
	private long geo_longitude;
	private String geo_method;
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
	
	public void setSynced(String synced) {
		this.synced = synced;
	}
	
	public String getSynced() {
		return this.synced;
	}
	
	public void setUserId(int user_id) {
		this.user_id = user_id;
	}
	
	public int getUserId() {
		return this.user_id;
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
	
	public void setGeoLatitude(long geo_latitude) {
		this.geo_latitude = geo_latitude;
	}
	
	public long getGeoLatitude() {
		return this.geo_latitude;
	}
	
	public void setGeoLongitude(long geo_longitude) {
		this.geo_longitude = geo_longitude;
	}
	
	public long getGeoLongitude() {
		return this.geo_longitude;
	}
	
	public void setGeoMethod(String geo_method) {
		this.geo_method = geo_method;
	}
	
	public String getGeoMethod() {
		return this.geo_method;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}