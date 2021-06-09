package com.phone;

public class PhoneBuilder {
	
	private String os,processor;
	private int ram,battery;
	private double screensize;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, processor, ram, battery, screensize);
	}
	

}
