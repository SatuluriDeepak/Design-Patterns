package com.adapater;

public class School {

	public static void main(String[] args) {
		AssignmentWork aw = new AssignmentWork();
		Pen pp = new PenAdapter();
		
		aw.setP(pp);
		aw.writeAssignment("Sorry brother cannot write");
		

	}

	

}
