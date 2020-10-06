/*22.Sort a ten element array in descending order.*/
import java.util.Scanner;
class Q22{
	
	public static void main(String args[]){
		
		
 	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any num1");
		 int arr[] = new int[]{2,5,4,3,7,8,9,10,1,6};
		 int i,j;
		 int temp;
	  
	      for(i=0; i< arr.length; i++)
		  {
			//arr[i] = sc.nextInt();
		    for(j = 0; j <arr.length-1; j++)
			 { 
				 if(arr[j] < arr[j+1])
				 {
				  temp = arr[j];
				
			      arr[j] = arr[j+1];
				
			      arr[j+1] = temp;
			     } 		
		     }
		   }
		System.out.println("*****************");
		
		for(int a : arr)
		{
			System.out.println(a);
		}
		
	}
	
}



