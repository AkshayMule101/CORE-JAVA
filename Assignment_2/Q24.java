/*24.Write a program to search an element in the array.*/

import java.util.Scanner;
class Q24{
	public static void main(String args[])
	{
	System.out.println("Enter value");
	
	Scanner sc = new Scanner(System.in);
		int i;
		int val = sc.nextInt();
		int arr[] = {1,2,3,4,5};
	
	for(i=0;i<arr.length;i++)
	{
		if(val == arr[i])
		{
			System.out.println("val is"+arr[i]+"found at index"+i);
					break;
		}

			else if(val != arr[i])
		{
			System.out.println("not found");
		}
	
			
	}
		

	
	
	}
}
