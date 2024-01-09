package Class_Object;

public class MicrowaveOven {
	
	String brandname="LG";
	String model="Grill Microwave Oven";
	int diameter=32;
	double width=45.9;
	double height=24.9;
	int capacity=20;
	String type="Countertop";
	String mode="Grill";
	String colour="Black";
	String material="Metal";
	int wattage=2000;
	String origin="India";
	int make=2023;
	int price=7709;
	public void grilling() {
		System.out.println("grilling");
	}
	public void reheating() {
		System.out.println("reheating");
	}
	public void defrosting() {
		System.out.println("defrosting");
	}
	public void cooking() {
		System.out.println("cooking");
	}
	public void setProperties(int diameter, double width, double height, int capacity, int wattage, int price) {
		this.diameter=diameter;
		this.width=width;
		this.height=height;
		this.capacity=capacity;
		this.wattage=wattage;
		this.price=price;
	}
	public void displayProperty() {
		System.out.println(brandname+model+diameter+width+height+capacity+type+mode+colour+material+wattage+origin+make+price);
	}
	public static void main(String args[]) {
		MicrowaveOven microwaveoven1=new MicrowaveOven();
		System.out.println(microwaveoven1.brandname);
		microwaveoven1.setProperties(48, 61.8, 37.5, 30, 3000, 9209);
		microwaveoven1.displayProperty();
		MicrowaveOven microwaveoven2=new MicrowaveOven();
		System.out.println(microwaveoven2.brandname);
		microwaveoven2.displayProperty();
	}
}
