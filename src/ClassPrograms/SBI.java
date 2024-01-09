package ClassPrograms;

public class SBI extends Bank{
	public int getRateofInterest() {
		return 5;
	}
public static void main(String[] args) {
	SBI s=new SBI();
	System.out.println("SBI Rate of Interest: "+s.getRateofInterest());
}
}
