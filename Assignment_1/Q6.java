/*06.	Write a program that takes radius of a circle as input. Read the 
entered radius using Scanner class. Then calculate and print the area and 
circumference of the circle.*/

import java.util.Scanner;

class Q6{
	
	public static void main(String args[]){
		 int r;
		 double  pi = 3.14,area,circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		r = sc.nextInt();
	   area = pi* r * r;
	   circumference = 2 * pi * r;
	   System.out.println("Area of circle :"+area+" Circumference of the circle is "+circumference);
	  }
}