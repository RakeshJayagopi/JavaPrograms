package Class_Object;

public class Circle {
	
	int radius;
	double area;
	double perimeter;
	double pi;
	
	public Circle(int radius, double area, double perimeter,double pi) {
		System.out.println("Constructor function is running");
		this.radius=radius;
		this.area=area;
		this.perimeter=perimeter;
		this.pi=pi;
	}
	public void display() {
		System.out.println("Radius: "+this.radius+"\narea: "+this.area+"\nperimeter: "+this.perimeter+"\npi: "+this.pi);
	}
	
	public static void main(String[] args) {
		
	}
}


