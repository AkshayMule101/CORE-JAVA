/*23.	Write a program to reverse the array elements.*/

import java.util.Scanner;
class Q23{
	public static void main(String args[])
	{
	System.out.println("Enter array elements");
	
	Scanner sc = new Scanner(System.in);
	
	int arr[] = new int[5];
	
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	
	  for(int i=arr.length-1;i>=0;i--)
	  {
		System.out.println(arr[i]);
	  }
	}
}