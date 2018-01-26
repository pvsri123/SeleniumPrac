package javaPractice;

import java.util.Arrays;

public class MinMaxnumbers {

	public static void main(String[] args) {
		
		int array[ ] = {-10,24,50,-88,987656};
		
		int maxVal = array[0];
		
		int minVal = array[0];
		
		for(int i=1; i<array.length;i++)
		{
			if(array[i]>maxVal)
			{
				maxVal = array[i];
			}
				
			else if (array[i]< minVal)
			{
				minVal = array[i];
			}
				
		}
		
		System.out.println("\n Given arrry is:"+Arrays.toString(array));
		System.out.println("Maximum number is:"+maxVal);
		System.out.println("Minimum number is:"+minVal);

	}

}
