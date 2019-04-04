package com.example.websocketdemo.model;

//created by Rutvik Patel

import java.io.Serializable;

public class LocationBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String user; //user name which user entered at page visit
    private String latitude;
    private String longitude;
    private String time; //unused field
    
    public LocationBean() {}
    
	public LocationBean(String user, String latitude, String longitude, String time) {
		super();
		this.user = user;
		this.latitude = latitude;
		this.longitude = longitude;
		this.time = time;
	}

	@Override
	public String toString() {
		return "LocationBean [user=" + user + ", latitude=" + latitude + ", longitude=" + longitude + ", time=" + time + "]";
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}