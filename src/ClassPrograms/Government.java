package ClassPrograms;

public class Government extends School{
	public double getScholarshipPercentage() {
		return 93.7;
	}
	public static void main(String[] args) {
		Government g=new Government();
		System.out.println("Government school Scholarship Percentage: "+g.getScholarshipPercentage());
	}
}
