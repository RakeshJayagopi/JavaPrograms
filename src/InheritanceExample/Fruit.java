package InheritanceExample;

public class Fruit {
	String name;
	public void eat() {
		System.out.println("eating");
	}
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.name="Apple";
	}
}
