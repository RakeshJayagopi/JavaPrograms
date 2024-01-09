package ClassPrograms;

public class DemoProgram {
	
	
	private int number;
	private int age;
//	method overloading
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
//	encapsulation
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return this.number;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public static void main(String[] args) {
		DemoProgram d=new DemoProgram();
		d.add(10.5f, 20.2f);
		d.add(10, 20,50);
	}
}
