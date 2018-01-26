package javaPractice;

public class MinMaxnumbersEx01 {

	public static void main(String[] args) {
		
		int array[ ] = {-10,24,50,-88,987656};
		
		int maxVal = array[0];
		int minVal = array[0];
		
		for(int i=1;i<array.length;i++)
		{
			maxVal = Math.max(maxVal, array[i]);
			minVal = Math.min(minVal, array[i]);
		}
		
		System.out.println("Maximum number::"+maxVal);
		System.out.println("Minimum number::"+minVal);
	}

}
