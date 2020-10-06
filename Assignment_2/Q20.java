/*20.	20.	Print all prime numbers between two given numbers. [ break continue ]*/
import java.util.Scanner;
class Q20{
	
	public static void main(String args[]){
		
		int num,i;
		int num1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num1");
		num = sc.nextInt();
		System.out.println("Enter any num2");
		num1 = sc.nextInt();
		while(num <= num1)
		{
			for(i = 2; i <= num; i++)
		{
			if(num % i == 0)
				break;
			
			
		}
		if(i == num)
		{
			System.out.println(num);	
				
		}
		num++;
	}

  }
}


