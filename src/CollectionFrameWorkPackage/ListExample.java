package CollectionFrameWorkPackage;

import java.util.ArrayList;

public class ListExample {

	
	public static void main(String[] args) {
//		int[]array=new int[10];
		int [] array= {20,20,30,4};
//		list
//		arraylist
//		linkedlist
		
		
		ArrayList<Integer> myList=new ArrayList<Integer>();
		myList.add(40);
		myList.add(20);
		myList.add(450);
		System.out.println(myList);
		System.out.println(myList.get(1));
	}
}
