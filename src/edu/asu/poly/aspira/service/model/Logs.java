/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

import java.sql.Timestamp;

public class Logs {
	
	private int id;
	private int device_id;
	private String type;	
	private String typecode;	
	private String timestamp;
	private String extras;
	private String createdAt;
	
	


	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setTypeCode(String typeCode) {
		this.typecode = typeCode;
	}
	
	public String getTypeCode() {
		return this.typecode;
	}
		
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTimestamp() {
		return this.timestamp;
	}
	
	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	public String getExtras() {
		return this.extras;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
}
