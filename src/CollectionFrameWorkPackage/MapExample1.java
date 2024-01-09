package CollectionFrameWorkPackage;

import java.util.*;

public class MapExample1 {
	
	public static void main(String[] args) {
		HashMap<String, Integer> brands=new HashMap<>();
		brands.put("LG", 1);
		brands.put("Samsung", 2);
		brands.put("Panasonic", 3);
		brands.put("Sony", 4);
		brands.put("Haier", 5);
		brands.get("LG");
		System.out.println("HashMap: "+brands);
	}

}
