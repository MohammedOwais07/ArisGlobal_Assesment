package com;

public class rectangle {

	
	int length;
	int width;

	
	void insert(int l, int w) {
		length=l;
		width=w;
	}
   
	void calcAreaOfRect() {
		System.out.println(" Area of rectangle is "+ (length*width));
	}

}
