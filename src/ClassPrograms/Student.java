package ClassPrograms;

public class Student{
	String name="Ajay";
	static String college="ITS";
	int rollno=28;
	int age=18;
	int mark=420;
//	instance block
	{
		System.out.println("block is running");
	}
	
//	static block
	static {
	System.out.println("static block");	
	}
	public Student(String name, int rollno, int age, int mark) {
		System.out.println("Student constructor function is live");
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.mark=mark;
	}
	public static void display() {
//		System.out.println("Student name: "+this.name+"\nrollno: "+this.rollno+"\nage: "+this.age+"\nmark: "+this.mark);
	}
	
	public static void main(String[] args) {
//		display();
////		System.out.println(Student.college);
//		Student s1=new Student("Prakash", 37, 18, 450);
////		System.out.println(s1.college);
//		Student s2=new Student("Vijay", 9, 18, 438);
		System.out.println("Hello");
		try {
			System.out.println(10/10);
		}
		catch(Exception e) {
			System.out.println("error");
		}
		
		System.out.println("program completed");
	}
}
