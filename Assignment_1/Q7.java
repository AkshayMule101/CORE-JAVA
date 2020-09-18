/*07 Write a program to calculate sum of 5 subject’s marks & find 
percentage. Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.*/

import java.util.Scanner;

class Q7{
	
	public static void main(String args[]){
		 int n=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of the C++");
		int CPP = sc.nextInt();
		System.out.println("Enter marks of the DS");
		int DS = sc.nextInt();
		System.out.println("Enter marks of the OS");
		int OS = sc.nextInt();
		System.out.println("Enter marks of the DBT");
		int DBT = sc.nextInt();
		System.out.println("Enter marks of the JAVA");
		int JAVA = sc.nextInt();
	   int sum = CPP + DS + OS + DBT + JAVA;
	   float percentage = sum /n;
	   System.out.println("percentage marks = " +percentage+"%");
	  }
}