package CollectionFrameWorkPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> setobj=new LinkedHashSet<>();
		
		setobj.add(45);
		setobj.add(-45);
		setobj.add(78);
		setobj.add(10);
		setobj.add(10);
		System.out.println(setobj);
	}
}
