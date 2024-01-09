package CollectionFrameWorkPackage;

import java.util.TreeSet;
public class SetExample3 {
	
	public static void main(String[] args) {
		TreeSet<String> countries = new TreeSet<String>(); 
		countries.add("India"); 
		countries.add("England"); 
		countries.add("Canada"); 
		countries.add("Japan"); 
		countries.clear();
		System.out.println(countries); 
	}

}
