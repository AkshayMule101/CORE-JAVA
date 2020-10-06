/*19.	Calculate  series : 12+22+32+42+.........+n2.*/
import java.util.Scanner;
class Q19{
	
	public static void main(String args[]){
		
		int num,i;
		int sq = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		num = sc.nextInt();
		for(i = 1; i <= num; i++)
		{
			sq = sq + i * i;
			
			
		}
			System.out.println(sq);	
				
	}
}