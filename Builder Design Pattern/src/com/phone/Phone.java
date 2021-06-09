package com.phone;

public class Phone {
	private String os,processor;
	private int ram,battery;
	private double screensize;
	
	public Phone(String os, String processor, int ram, int battery, double screensize) {
		super();
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.battery = battery;
		this.screensize = screensize;
	}
	@Override
	public String toString() {
		return "Phone [os = " + os + ", processor = " + processor + ", ram = " + ram + ", battery = " + battery
				+ ", screensize = " + screensize + "]";
	}
	
	
	
	

}
