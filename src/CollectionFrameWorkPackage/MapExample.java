package CollectionFrameWorkPackage;

import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> vegetables=new TreeMap<>();
		vegetables.put("Cucumber", 17);
		vegetables.put("Carrot", 15);
		vegetables.put("Beans", 24);
		vegetables.put("Spinach", 27);
		vegetables.put("Beetroot", 30);
		System.out.println("TreeMap: "+vegetables);
	}

}
