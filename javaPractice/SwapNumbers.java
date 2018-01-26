package javaPractice;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
		// First method
		
		/*int temp;
		
		temp = x;
		x=y;
		y=temp;*/
		
		// Second method
		
		/* x = x+y;
		 y= x-y;
		 x= x-y;
		 */
		
		// Third method
		 
		/*x= x*y;
		y=x/y;
		x=x/y;
		 */
		 
		
		// Fourth method : XOR:^
		
		x= x^y;
		y=x^y;
		x=x^y;
				
		 System.out.println(x);
		 System.out.println(y);
		  
	}

}
