package com.phone;

public class OSFactory {
	public OS getOs(String str) {
		if(str.equals("Android")) {
			return new Android();
		}
		else if(str.equals("IOS")) {
			return new IOS();
		}
		return new Windows();
	}

}
