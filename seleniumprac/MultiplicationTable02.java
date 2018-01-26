package seleniumprac;

public class MultiplicationTable02 {

	public static void main(String[] args) {
		
		// print main table
		
	      for (int i = 1; i <= 20; i++) 
	      {
	         System.out.print(i + ":");
	         for (int j = 1; j <= 20; j++) 
	         {
	            System.out.print(i*j + " ");
	         }
	         System.out.println();
	      }

	}

}
