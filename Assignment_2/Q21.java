/*21.Program to show sum and average of 10 element array. Accept array elements from user*/
import java.util.Scanner;
class Q21{
	
	public static void main(String args[]){
		
		
 		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num1");
		int arr[] = new int[10];
		
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("*****************");
		for(int a : arr)
		{
			System.out.println(a);
		}
	}
	
}



