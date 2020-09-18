/*18.	Program to check whether number is prime or not.*/
import java.util.Scanner;
class Q18{
	public static void main(String args[]){
          int num;
	boolean isprime = true;
 
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");      
	num = sc.nextInt();
     for(int i=2; i<num; i++) {
	if(num%i==0)
	{
	 isprime = false;
	break;
	}
}

	if(isprime)
	{
	System.out.println(num + " is a prime number");
	
	}
   else
      {
    System.out.println("num is not prime");
	}
    }
 
   }
   
 