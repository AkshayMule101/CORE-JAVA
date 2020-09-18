/*17.	Write a program to reverse a given number.*/

import java.util.Scanner;
class Q17{
	public static void main(String args[]){
          int num, rev = 0;
 
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter any num");      
	num = sc.nextInt();
      while(num != 0){
	int d = num % 10;
	rev = rev * 10 + d;
        num = num / 10;
   }
    System.out.println("the reverse number is " +rev);
  }
}
   
 