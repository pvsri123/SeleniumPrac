package seleniumprac;

import java.util.ArrayList;

public class DynamicArrayListEx01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> mynumbers = new ArrayList<Integer>();
		
		mynumbers.add(100);
		mynumbers.add(200);
		mynumbers.add(300);
		mynumbers.add(400);
		
		for(Integer numbers: mynumbers){
			
			System.out.println(numbers);
			
		}

	}

}
