package BasicPrograms;

public class Array8 {
	public static void main(String args[]) {
		int[]array= {37,48,95,14,26};
		for(int i=0;i<10;i++) {
			if(i==3) {
				continue;
			}
			System.out.println("i="+i);
		}	
	}
}
