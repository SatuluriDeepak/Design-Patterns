package com.adapater;

import com.person.RedPen;

public class PenAdapter implements Pen {
	RedPen rp = new RedPen();

	@Override
	public void write(String str) {
		rp.mark(str);
		
	}
}
