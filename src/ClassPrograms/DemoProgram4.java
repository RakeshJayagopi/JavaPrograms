package ClassPrograms;

public class DemoProgram4 {
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void multiply(float a, float b) {
		System.out.println(a*b);
	}
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}
	public void multiply(long a, long b) {
		System.out.println(a*b);
	}
	public void multiply(byte a, byte b) {
		System.out.println(a*b);
	}
	public void multiply(short a, short b) {
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		DemoProgram4 d=new DemoProgram4();
		d.multiply(20, 40);
		d.multiply(23.4, 86.9);
		d.multiply(45.7, 29.1);
		d.multiply(23457, 12840);
		d.multiply(-45, 39);
		d.multiply(-3892, -9149);
		
	}
}
