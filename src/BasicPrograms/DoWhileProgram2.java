package BasicPrograms;

public class DoWhileProgram2 {
	public static void main(String args[]) {
		int count=0;
		int i=2;
		do {
			System.out.println("i="+i);
			count++;
			i+=2;
		}while(count<=20);
	}

}
