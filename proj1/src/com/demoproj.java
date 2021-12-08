package com;

public class demoproj {

	
	public enum colors{white, red, black, blue, grey}
	public static void main(String[] args) {
		colors color[]= colors.values();
		
		for(colors now :color) {
			switch(now) {
			case white:
				System.out.println("The color is white ");
				break;
			case red:
				System.out.println("The color is red");
				break;
			case black:
				System.out.println("The color is black");
				break;
			case blue:
				System.out.println("The color is blue");
				break;
			default :
		
				System.out.println("The color is grey");
				break;
			}
			
		}

	}

}
