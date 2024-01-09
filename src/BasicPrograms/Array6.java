package BasicPrograms;

public class Array6 {
	public static void main(String args[]) {
		int[]array= {1,3,5,7,9};
		int y=array.length;
		System.out.println("array.length");
		int sum=(array[0])+(array[y-1]);
		if(sum>10) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
