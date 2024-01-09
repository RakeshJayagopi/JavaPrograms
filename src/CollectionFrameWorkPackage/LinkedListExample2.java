package CollectionFrameWorkPackage;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<Integer> myList=new LinkedList<Integer>();
		myList.add(7);
		myList.add(1, 76);
		myList.addFirst(9);
		myList.addLast(24);
		System.out.println(myList);
		ListIterator<Integer> list=myList.listIterator();
		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
//		
//		myList.remove(2);
//		myList.remove();
//		myList.removeFirst();
//		myList.removeLast();
//		System.out.println(myList);
	}
}
