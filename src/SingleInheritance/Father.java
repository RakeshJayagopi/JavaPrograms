package SingleInheritance;

public class Father {
	public String name;
	int age;
	String profession;
	public Father(String name, int age, String profession) {
		System.out.println("Father class constructor");
		this.name=name;
		this.age=age;
		this.profession=profession;
	}
	public void display() {
		System.out.println("Father name: "+this.name+"\nage: "+this.age+"\nprofession: "+this.profession);
	}
	public static void main(String[] args) {
	Father f=new Father("Ajay", 54, "Analyst");
		f.display();
	}
}
