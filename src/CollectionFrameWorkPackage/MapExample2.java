package CollectionFrameWorkPackage;

import java.util.*;

public class MapExample2 {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> numbers=new HashMap<>();	
		for(int i=1; i<11; i++) {
			numbers.put(i, i*i);
		}			
		System.out.println("HashMap: "+numbers);
	}
}
