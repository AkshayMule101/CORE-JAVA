/*17.	Write a program to reverse a given number.*/
import java.util.Scanner;
class Q17{
	
	public static void main(String args[]){
		
		int num,n;
		int rem =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		num = sc.nextInt();
		while(num != 0)
		{
			n = num % 10;
			
			num = num / 10;
			
			rem = rem * 10 + n;
			
		}
		
		System.out.println("the reverse number is:"+rem);
		
	}
}