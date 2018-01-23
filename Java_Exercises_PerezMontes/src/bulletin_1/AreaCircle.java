package bulletin_1;

import java.lang.Math;
import java.util.Scanner;

public class AreaCircle {
	
	 private double area_circle;
	 private int radius;
	 
	 AreaCircle(){
		 askUser();
	 }
	 
	 
	 ////Getters and Setters/////
	 public void setAreaCircle(double area_circle) {
		 this.area_circle = area_circle;
	 }
	 public double getAreaCircle() {
		 return this.area_circle;
	 }
	 ////////////////////////////
	 
	 private void askUser() {
		 
		 System.out.println("Type the radius of the circle");
		 Scanner user_input = new Scanner(System.in);
		 
		 this.radius = user_input.nextInt();
		 areaCalculation();
		 
	 }
	 private double areaCalculation() {
		 
		 this.area_circle = Math.PI * (this.radius * this.radius);
		 return this.area_circle;
	 }
}
