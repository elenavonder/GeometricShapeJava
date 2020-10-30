package com.maxtrain.elena;

public class Square implements IPerimeter{

	public Rect rect;

	public int getSide1() {
		return rect.getSide1();
	}
	
	public void setSide1(int s) {
		rect.setSide1(s);
		rect.setSide2(s);
	}
	
	public int perimeter() {
		return rect.perimeter();
	}
	
	public int area() {
		return rect.area();
	}
	
	public Square(int s) {
		rect = new Rect(s, s);
	}
	public Square() {
		this (0);
	}
}
