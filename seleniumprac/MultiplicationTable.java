package seleniumprac;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		int num, i;
	      System.out.println("Enter an integer to print it's multiplication table");
	      Scanner number = new Scanner(System.in);
	      num = number.nextInt();
	     
	      System.out.println("Multiplication table of "+num+" is :-");
	 
	      for ( i = 1 ; i <= 10 ; i++ )
	         System.out.println(num+"*"+i+" = "+(num*i));
	}
	     
	 	
}
