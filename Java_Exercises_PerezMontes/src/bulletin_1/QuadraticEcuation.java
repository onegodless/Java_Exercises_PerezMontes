package bulletin_1;

import java.lang.Math;
import java.util.Scanner;

public class QuadraticEcuation {
	
	private int a;
	private int b;
	private int c;
	private double discriminant; 
	private double real_root1;
	private double real_root2;
	
	
	QuadraticEcuation(){
		askUser();
	}
	
	private void askUser(){
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Type the coefficient 'a'");
		this.a  = user_input.nextInt();
		System.out.println("Type the coefficient 'b'");
		this.b = user_input.nextInt();
		System.out.println("Type the coefficient 'c'");
		this.c = user_input.nextInt();
		
		solution();
	}
	
	private void solution() {
		
		this.discriminant = (this.b * this.b)-4*this.a*this.c; //b^2-4ac
		
		if(this.discriminant > 1) {
			this.real_root1 = ((this.b * -1) + Math.sqrt(this.discriminant))/(2 *  this.a); //-b + square_root_of(discriminant)/2a
			this.real_root2 = ((this.b * -1) - Math.sqrt(this.discriminant))/(2 * this.a);
			System.out.println("First real root is equal to: " + this.real_root1);
			System.out.println("Second real root is equal to: " + this.real_root2);
		}
		if(this.discriminant == 0) {
			System.out.println("meow");
			this.real_root1 = (this.b * -1)/ 2 * this.a;
			System.out.println("Real is root is equal to: " + this.real_root1);
		}
		if(this.discriminant < 0) {
			System.out.println("There are no real roots for these coefficients.");
		}
	}
}
