package seleniumprac;

public class MultiplicationTable03 {

	public static void main(String[] args) {
		
		// print main table
		
	      for (int i = 1; i<= 20; i++) 
	      {
	         System.out.println("Multiplicatio table for number"+" "+i+":-");
	         System.out.println("*************************************");
	         
	         for (int j = 1; j<= 10;j++) 
	         {
	            System.out.println(i+"*"+j+"="+i*j);
	         }
	         System.out.println("*************************************");
	      }

	}

}
