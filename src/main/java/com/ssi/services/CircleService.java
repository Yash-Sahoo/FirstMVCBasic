package com.ssi.services;

import org.springframework.stereotype.Service;

import com.ssi.models.Circle;

@Service
public class CircleService {

	public Circle calculate(double radius) {
		double area=3.14*radius*radius;
		double circumference=2*3.14*radius;
		Circle circle=new Circle();
		circle.setArea(area);
		circle.setCircumference(circumference);
		circle.setRadius(radius);
		return circle;
	}
	
}
