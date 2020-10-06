/*18.	Program to check whether number is prime or not.*/
import java.util.Scanner;
class Q18{
	
	public static void main(String args[]){
		
		int num,i;
		//int rem =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		num = sc.nextInt();
		for(i = 2; i < num; i++)
		{
			if(num%i == 0){
				break;
			}
			
			
		}
		if(i == num){
			System.out.println("the entered num is prime num");	
			}
			else{
			System.out.println("the entered num is not prime num");
			}
		
				
	}
}