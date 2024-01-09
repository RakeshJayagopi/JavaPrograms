package BasicPrograms;

public class DoWhileProgram3 {
	public static void main(String args[]) {
		int count=0;
		int i=1;
		do {
			System.out.println("i="+i);
			count++;
			i+=2;
		}while(count<=19);
	}

}

