package CollectionFrameWorkPackage;

import java.util.LinkedHashMap;

public class MapExample3 {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> fruits=new LinkedHashMap<>();
		fruits.put("Orange", 3);
		fruits.put("Mango", 4);
		fruits.put("Papaya", 5);
		fruits.put("Kiwi", 6);
		fruits.put("Watermelon", 7);
		fruits.put("Banana", 9);
		fruits.remove("Orange");
		System.out.println("LinkedHashMap: "+fruits);
	}

}
