package InheritanceExample;

public class Surgeon {
	String name;
	public void operate() {
		System.out.println("operation");
	}
	public static void main(String[] args) {
		Surgeon s=new Surgeon();
		s.name="Ram";
	}
}
