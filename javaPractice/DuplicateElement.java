package javaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[] = {"java","javascript","perl","C","java"};
		
		for (int i=0;i<names.length;i++)
		{
			for (int j=i+1;j<names.length;j++)
			{
				
				if(names[i].equals(names[j]))
				{
					
					System.out.println("Duplicate element is::"+names[i]);
					
				}
			}
		}

		System.out.println("*********************************************");
		
		// using HashSet : java collection: it stores unique values
		
		Set<String> store = new HashSet<String>();
		
		for(String name: names)
		{
			if(store.add(name)== false)
			{
				System.out.println("Duplicate element is::"+name);
			}
			
		}
		
		// using HashMap
		// Map is an interface and HashMap is a class
		
		Map<String,Integer> StoreMap =new HashMap<String,Integer>();
		
		for(String name: names)
		{
			Integer count = StoreMap.get(name);
			
			if(count==null)
			{
				StoreMap.put(name, 1);
			}
			else 
			{
				StoreMap.put(name, ++count);
			}
		}

		System.out.println("*********************************************");
		
		// get the values from this HashMap
		
		Set<Entry<String, Integer>> entrySet = StoreMap.entrySet();
		for(Entry<String,Integer> entry: entrySet)
		{
			if(entry.getValue()>1)
				System.out.println("Duplicate element is::"+entry.getKey());
		}
		
	}

}
