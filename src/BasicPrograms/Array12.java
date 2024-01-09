package BasicPrograms;

public class Array12 {
	public static void main(String args[]) {
		int[]array=new int[10];
		array[0]=2;
		array[1]=4;
		array[2]=6;
		array[3]=8;
		array[4]=10;
		int[]array3= {2,4,6,8,10};
		int sum=0;
		for(int i:array3) {
			sum+=i;
			System.out.println("i="+i);
		}
	}

}
