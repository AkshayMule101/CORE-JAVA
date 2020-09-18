/*Simple Interest*/

import java.util.Scanner;

class Q8{
	
	public static void main(String args[]){
		 int p,t;
		 float r,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle");
		p = sc.nextInt();
		System.out.println("Enter Rate of Interest");
		r = sc.nextFloat();
		System.out.println("Enter Time");
		t = sc.nextInt();
	   si = (p * r * t) /100 ;
	   
	   System.out.println("Simple Interest = "+ si);
	  }
}