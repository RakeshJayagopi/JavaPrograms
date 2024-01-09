package CollectionFrameWorkPackage;

import java.util.ArrayList;

public class Student {
	String name;
	int age;
	int rollno;
	int mark;
	
	public Student(String name, int age, int rollno, int mark) {
		System.out.println("Student constructor");
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.mark=mark;
	}
	
	public void setProperty(String name, int age, int rollno, int mark) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.mark=mark;
	}
	
	public void display() {
		System.out.println("Student name: "+this.name+"\nage: "+this.age+"\nrollno: "+this.rollno+"\nmark: "+this.mark);
	}
	
	public static void main(String[] args) {
		Student s1=new Student("Prakash",17, 7, 420);
		s1.display();
		Student s2=new Student("Arun", 17, 24, 412);
		s2.display();
		Student s3=new Student("Ram", 17, 5, 408);
		s3.display();
		ArrayList<Student> myList=new ArrayList<Student>();
		myList.add(s1);
		myList.add(s2);
		myList.add(s3);
		System.out.println("Student: "+myList);
	}
	
}
