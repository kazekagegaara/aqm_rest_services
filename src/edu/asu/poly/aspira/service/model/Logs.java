/**
 * @author Manit Singh Kalsi
 */

package edu.asu.poly.aspira.service.model;

public class Logs {
	
	private int id;
	private String type;	
	private String synced;	
	private String timestamp;
	private String extras;
	private String createdAt;
	
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
