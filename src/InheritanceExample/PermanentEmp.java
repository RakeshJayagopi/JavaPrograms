package InheritanceExample;

public class PermanentEmp extends Employee {
	double hike=0.5;
	public void incrementSalary() {
	super.dispSalary();
		System.out.println("The Permanent Employee incremented salary is:" +(salary+(salary*hike)));
	}

}
