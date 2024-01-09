package BasicPrograms;

public class Array5 {
	public static void main(String args[]) {
		int[]array= {6,7,2,8,4};
		int x=array.length;
		System.out.println(array.length);
		if((array[0]==6)||(array[x-1]==6)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
