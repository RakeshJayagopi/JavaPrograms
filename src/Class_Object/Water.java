package Class_Object;

public class Water {
	
	String name="Bisleri";
	String material="Plastic";
	String color="White";
	String shape="Cylinder";
	int price=199;
	int quantity=1;
	double length=27.9;
	double width=10.2;
	double height=7.6;
	public void production() {
		System.out.println("production");
	}
	public void manufacturing() {
		System.out.println("manufacturing");
	}
	public void distribution() {
		System.out.println("distribution");
	}
	public void marketing() {
		System.out.println("marketing");
	}
	public static void main(String[]args) {
		Water water1=new Water();
		System.out.println(water1.name);
		Water water2=new Water();
		System.out.println(water2.name);
	}
}

