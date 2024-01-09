package Class_Object;

public class SimpleCalculator {

	String name;
	double firstNumber;
	double secondNumber;
	int addition;
	int subtraction;
	int multiplication;
	int division;
	int result;
	String display;
	
	public SimpleCalculator(String name, double firstNumber, double secondNumber, int addition, int subtraction, int multiplication, int division, int result, String display) {
		System.out.println("Calculator function is running");
		this.name=name;
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
		this.addition=addition;
		this.subtraction=subtraction;
		this.multiplication=multiplication;
		this.division=division;
		this.result=0;
		this.display="0";
	}
	public void Display() {
		System.out.println("Name: "+this.name+"\nfirstNumber: "+this.firstNumber+"\nsecondNumber: "+this.secondNumber+"\naddition: "+this.addition+"\nsubtraction: "+this.subtraction+"\nmultiplication: "+this.multiplication+"\ndivision: "+this.division+"\nresult: "+this.result+"\ndisplay: "+this.display);
	}
	public double getFirstNumber() {
		return this.firstNumber;
	}
	public double getSecondNumber() {
		return this.secondNumber;
	}
	public void setFirstNumber(double firstNumber ) {
		this.firstNumber=firstNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;
	}
	public void getAdditionResult() {
		System.out.println("Addition of two numbers"+(this.firstNumber+this.secondNumber));
	}
	public void getSubtractionResult() {
		System.out.println("Subtraction of two numbers"+(this.secondNumber-this.firstNumber));
	}
	public void getMultiplicationResult() {
		System.out.println("Multiplication of two numbers"+(this.firstNumber*this.secondNumber));
	}
	public void getDivisionResult() {
		System.out.println("Division of two numbers"+(this.firstNumber/this.secondNumber));
	}
	public static void main(String[] args) {
		System.out.println("Hello");
//		getAdditionResult();
//		getSubtractionResult();
//		getMultiplicationResult();
//		getDivisionResult();
	}
}
