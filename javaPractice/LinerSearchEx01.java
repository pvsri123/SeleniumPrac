package javaPractice;

public class LinerSearchEx01 {

	public static void main(String[] args) {
		
		int [] list = {10,28,46,-10,93,6,101,34};
		int location = LinearSearch(list,46);
		System.out.println("Index of the selected element in array is:"+location);
		
	}
	
	public static int LinearSearch(int[] list, int targetValue){
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i]== targetValue)
			{
				
				return i; // return index
			}
				
		}
				
		return -1; // Element not found
		
	}

}
