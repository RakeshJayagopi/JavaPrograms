package ClassPrograms;

public class ICICI extends Bank {
	public int getRateofInterest() {
		return 7;
	}
public static void main(String[] args) {
	ICICI i=new ICICI();
	System.out.println("ICICI Rate of Interest: "+i.getRateofInterest());
}
}
