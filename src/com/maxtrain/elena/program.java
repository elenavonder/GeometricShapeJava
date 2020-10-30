package com.maxtrain.elena;

import java.util.ArrayList;

public class program {

	public static void main(String[] args) {

		var q1 = new Quad(3, 4, 5, 6);
		System.out.println("Perimeter of quad is " + q1.perimeter());
		
		var r1 = new Rect(5, 2);
		var str = String.format("Perimeter is %d and Are is %d", r1.perimeter(),r1.area());
		System.out.println(str);
		
		var s1 = new Square(5);
		var stn = String.format("Perimeter is %d and Are is %d", s1.perimeter(),s1.area());
		System.out.println(stn);
		
		var shapes = new ArrayList<IPerimeter>();
		shapes.add(q1);
		shapes.add(r1);
		shapes.add(s1);
		for(var shape : shapes) {
			System.out.println("Perimeter of the shapes is " + shape.perimeter());
		}

	}
}
