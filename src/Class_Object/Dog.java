package Class_Object;

public class Dog {
	
	String name="tommy";
	String breed="German shepherd";
	String color="black";
	int height=24;
	int weight=30;
	int age=4;
	public void run() {
		System.out.println("running");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
	public void eat() {
		System.out.println("eating");
	}
	public static void main(String[] args) {
		Dog dog1=new Dog();//instantiation
		System.out.println(dog1.name);
		dog1.name="john";
		System.out.println(dog1.name);
		Dog dog2=new Dog();
		System.out.println(dog2.name);
	}

}
