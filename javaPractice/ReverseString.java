package javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="Selenium";
		String reverse = "";
		int strlen = s.length();
		
		// 1.using for loop
		
		for(int i=strlen-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i);
		}
			
		System.out.println(reverse);
		
		
		//2. using StringBuffer class
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
		
	}

}
