package com.basic.java;

import com.acad.basic.Car;

public class Black extends Car{
int noOfGear;

	public int getStart(int n){
		System.out.println(noOfGear);
return noOfGear;
	}
		
	public static void main(String[] args) {
		Black b=new Black();
		
		
		b.getWheels();
	}
}
