/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

import java.sql.Timestamp;

public class Logs {
	
	private int id;
	private String type;	
	private String synced;	
	private Timestamp timestamp;
	private String extras;
	private Timestamp createdAt;
	
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
	
	public void setExtras(String extras) {
		this.extras = extras;
	}
	
	public String getExtras() {
		return this.extras;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getCreatedAt() {
		return this.createdAt;
	}
}
