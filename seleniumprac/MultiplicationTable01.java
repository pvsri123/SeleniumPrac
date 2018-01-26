package seleniumprac;

import java.util.Scanner;

public class MultiplicationTable01 {

	public static void main(String[] args) {
		
		int number;
		
		System.out.println("Enter number for multiplication:");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		System.out.println("Multiplication table of "+number+"is:");
		// call function
		
		multiplicationtable(number);
		
	}
  private static void multiplicationtable(int n){
	  
	  for(int i=1;i<=10;i++){
		  
		  
		  System.out.println(n+"*"+i+"="+(n*i));
		  		  
	  }
  }
}
