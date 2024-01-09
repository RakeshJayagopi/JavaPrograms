package CollectionFrameWorkPackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> Bikes=new LinkedList<String>();
		Bikes.add("Yamaha");
		Bikes.add("Royal Enfield");
		Bikes.add("Harley-Davidson");
		Bikes.add("Kawasaki");
		Bikes.add(4, "Honda");
		Bikes.addFirst("TVS");
		Bikes.addLast("Bajaj");
		System.out.println("Bikes");
		ListIterator<String> bike=Bikes.listIterator();
				
		while(bike.hasPrevious()) {
		System.out.println(bike.previous());
		}
	}
}

