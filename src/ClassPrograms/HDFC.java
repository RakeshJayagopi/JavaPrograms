package ClassPrograms;

public class HDFC extends Bank{
	public int getRateofInterest() {
		return 9;
	}
public static void main(String[] args) {
	HDFC h=new HDFC();
	System.out.println("HDFC Rate of Interest: "+h.getRateofInterest());
}
}
