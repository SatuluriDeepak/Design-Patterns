package com.phone;

public class BuyPhone {
	public static void main(String args[]) {
		Phone pb = new PhoneBuilder().getPhone();;
		
		System.out.println(pb.toString());
	}

}
