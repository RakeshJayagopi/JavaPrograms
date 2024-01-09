package BasicPrograms;

public class Array13 {
	public static void main(String args[]) {
		int[]array=new int[3];
		array[0]=12;
		array[1]=24;
		array[2]=36;
		int temp=1;
		for(int i:array) {
			temp*=i;
		}
		System.out.println("temp="+temp);
	}

}
