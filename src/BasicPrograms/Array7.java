package BasicPrograms;

public class Array7 {
	public static void main(String args[]){
		int[]array= {25,50,75,100,125};
		int sum=0;
		int b=array.length;
		for(int i=0;i<b;i++) {
			sum+=array[i];
			System.out.println("Sum of array elements:"+sum);
		}
	}

}
