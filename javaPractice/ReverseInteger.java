package javaPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// using a long
		long num = 12345;
		long rev =0;
		
		while(num!=0)
		{
				
		rev = rev *10 + num%10;
		num =num/10;
		}
		System.out.println("Reverse number is:"+rev);
		
		// using StringBuffer
		long num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
