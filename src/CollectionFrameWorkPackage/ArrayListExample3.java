package CollectionFrameWorkPackage;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		int[] array= {10,20,40};
		int sum=0;
		int n=array.length;
		
		ArrayList<Integer> myList=new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(40);
		for(int i=0;i<n;i++) {
		sum+=array[i];
		}
		System.out.println("Sum of array elements: "+sum);
		}
	}
