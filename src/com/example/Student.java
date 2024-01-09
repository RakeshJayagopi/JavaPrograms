package com.example;

public class Student{
	String name;
	int age;
	int mark;
	public Student(String name, int age, int mark) {
		System.out.println("student class constructor");
		this.name=name;
		this.age=age;
		this.mark=mark;
	}

	public void education() {
		System.out.println("Studies");
	}
	public void display() {
		System.out.println("Student name: "+this.name+"\nage: "+this.age+"\nmark: "+this.mark);
	}
	
	public static void main(String[] args) {
		Student s=new Student("Akash", 17, 425);
		s.display();
	}
}
