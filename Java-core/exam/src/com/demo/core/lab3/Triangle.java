package com.demo.core.lab3;

public class Triangle extends AbstractShape {
     int base;
     int height;
     public Triangle(String color, int base, int height) {
 		super(color);
 		this.base = base;
 		this.height = height;
 	}
 	
 	public double getArea() {
 		return 0.5 * base * height;
 	}
 	public String toString() {
 		return " Color:  " + color +", "+ "Base: "+ base + "cm" + ", " + height + "cm";
 	}
 	 public static void main(String[] args) {
 		Triangle triangle1 = new Triangle("yellow", 20, 15);
 		
 		System.out.println("Triangle: " + triangle1);
 		System.out.print("Area: " + triangle1.getArea() + "cm2");
 
 	}
}