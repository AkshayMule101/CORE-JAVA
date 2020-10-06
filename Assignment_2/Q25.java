/*25.	Write the program to find the sum of even elements and sum of odd elements 
present in the array of integer type.*/


class Q25{
	public static void main(String args[])
	{

	
		int i;
		int arr[] = {1,2,3,4,5};
		int sum=0,sum1 = 0;
		
	
	for(i=0;i<arr.length;i++)
	{
		if(arr[i] % 2==0)
		{
				sum = sum + arr[i];
		}
		else
		{
			sum1 = sum1 + arr[i];
		}
	
	    	
	}
		System.out.println("sum of even numbers is"+sum);
	    System.out.println("sum of odd numbers is"+sum1);
		
  }

}

