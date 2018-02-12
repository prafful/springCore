package com.spring.di;

public class Friend {
		
	private String name;
	private Location location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Friend(String name, Location location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	public Friend( Location location) {
		super();
		
		this.location = location;
	}
	
	public String myLocation(){
		return location.tellMyLocation();
	}
	
	
	

}
