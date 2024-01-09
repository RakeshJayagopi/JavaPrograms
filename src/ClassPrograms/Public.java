package ClassPrograms;

public class Public extends School{
	public double getScholarshipPercentage() {
		return 81.5;
	}
	public static void main(String[] args) {
		Public p=new Public();
		System.out.println("Public school Scholarship Percetage: "+p.getScholarshipPercentage());
	}
}
