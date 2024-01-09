package Class_Object;

public class AirConditioner {
	
	String brandname;
	String model;
	int capacity;
	String type;
	String colour;
	double weight;
	double height;
	double width;
	double length;
	
	public AirConditioner(String brandname, String model, int capacity, String type, String colour, double weight, double height, double width, double length) {
		System.out.println("Constructor function is running");
		this.brandname=brandname;
		this.model=model;
		this.capacity=capacity;
		this.type=type;
		this.colour=colour;
		this.weight=weight;
		this.height=height;
		this.width=width;
		this.length=length;
	}
	public void display() {
		System.out.println("Brand name: "+this.brandname+"\nmodel: "+this.model+"\nCapacity: "+this.capacity+"\ntype: "+this.type+"\ncolour: "+this.colour+"\nweight: "+this.weight+"\nheight: "+this.height+"\nwidth: "+this.width+"\nlength: "+this.length);
	}
	public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner("LG","2 Star DUAL Inverter Split AC", 1,"Split System","White", 33.5, 18.9, 83.7, 30.8);
		ac1.display();
		AirConditioner ac2=new AirConditioner("LG","2 Star DUAL Inverter Split AC", 2,"Split System","Grey", 50.5, 27.8, 125.6, 61.6);
		ac2.display();
	}

}
