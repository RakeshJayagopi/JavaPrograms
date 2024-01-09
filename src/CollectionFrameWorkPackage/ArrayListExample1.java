package CollectionFrameWorkPackage;

import java.util.ArrayList;

public class ArrayListExample1 {
	
	  public static void main(String[] args) {
		  
	    ArrayList<String> animals = new ArrayList<String>();
	    animals.add("Cat");
	    animals.add("Dog");
	    animals.add("Crow");
	    animals.add("Frog");
	    System.out.println(animals);
	    String str = animals.get(1);
	    System.out.println("Element at index 1: "+str);
	  }
	}


