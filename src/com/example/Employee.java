package com.example;

public class Employee extends Student{
	
	float salary;
	int pfnumber;
	public Employee(String name, int age, int mark,float salary, int pfnumber) {
		super(name,age,mark);
		System.out.println("employee class constructor");
		this.salary=salary;
		this.pfnumber=pfnumber;
	}
	public void job() {
		System.out.println("Manager");
	}
	public void display() {
		System.out.println("Employee name: "+this.name+"\nage: "+this.age+"\n mark: "+this.mark+"\nsalary: "+this.salary+"\npfnumber: "+this.pfnumber);
	}
	public static void main(String[] args) {
		Employee e=new Employee("Akash", 29, 430,50000, 0000456);
		e.display();
	}
}
