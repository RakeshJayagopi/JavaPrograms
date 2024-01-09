package InheritanceExample;

public class Person {
	String name;
	public void nationality() {
		System.out.println("Indian");
	}
	public void place() {
		System.out.println("Puducherry");
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.name="Vijay";
	}
}
