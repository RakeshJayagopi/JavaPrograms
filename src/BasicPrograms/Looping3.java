package BasicPrograms;

public class Looping3 {
	public static void main(String args[]) {
		int count=0;
		int num=1;
		while(num<=10) {
			count=count+num;
			num++;
		}
		System.out.println("count="+count);
	}

}
