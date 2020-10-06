/*16.	Write a program to print table of any entered number using loop.*/

import java.util.*;
class Q16{
	
	public static void main(String[] args){
		int num,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		num = sc.nextInt();
		
		for(i=1; i<11; i++)
		{
			int j = num * i;
			
			System.out.println(j);
		}
	}
}
	