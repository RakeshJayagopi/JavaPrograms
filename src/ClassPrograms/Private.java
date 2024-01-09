package ClassPrograms;

public class Private extends School{
	public double getScholarshipPercentage() {
		return 70.9;
	}
	public static void main(String[] args) {
	Private p=new Private();
	System.out.println("Private school Scholarship Percentage: "+p.getScholarshipPercentage());
}
}
