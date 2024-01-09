package CollectionFrameWorkPackage;

import java.util.ArrayList;

public class ArrayListExample4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myList=new ArrayList<Integer>();
		
		myList.add(5);
		myList.add(34);
		myList.add(89);
		
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		
		int temp=0;
		
		for (int i=0; i < myList.size(); i++){
		temp=myList.get(i);
		if (temp%2==0) {
		even.add(temp);
		}else{
		odd.add(temp);
		}
	 }
		System.out.println("Even ArrayList:" +even);
		System.out.println("Odd ArrayList:" +odd);
  } 
}


