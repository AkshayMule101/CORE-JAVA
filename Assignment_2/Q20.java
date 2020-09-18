/*	20.	Print all prime numbers between two given numbers. [ break continue ]*/

import java.util.Scanner;
class Q20{

 public static void main(String args[]){
     int l,u,i,x;
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter two num");
	  l = sc.nextInt();
	   u = sc.nextInt();
	for(x=l+1; x<=u-1; x++) {
	     for(i=2;i<x;i++){
	      if(x%i == 0){
	        break;
	      }	}
	    if(i==x){
	 System.out.println(x);
	}
}
       
}

}
