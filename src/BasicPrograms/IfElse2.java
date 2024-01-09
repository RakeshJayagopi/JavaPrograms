package BasicPrograms;

public class IfElse2 {
	public static void main(String args[]) {
		int num=76;
		System.out.println(num%100);
		if((num>=90)&&(num<100)) {
			System.out.println("A grade or pass out of 100 marks");
		}else if((num>=80)&&(num<90)) {
			System.out.println("B grade or pass out of 100 marks");
		}else if((num>=70)&&(num<80)) {
			System.out.println("C grade or pass out of 100 marks");
		}else if((num>=60)&&(num<70)) {
			System.out.println("D grade or pass out of 100 marks");
		}else if((num>=50)&&(num<60)) {
			System.out.println("E grade or pass out of 100 marks");
		}else{
			System.out.println("F grade or fail out of 100 marks");
		}
	}

}
