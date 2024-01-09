package Class_Object;

public class Refrigerator {
	
	String brandname;
	String model;
	int capacity;
	String installationtype;
	String formfactor;
	String colour;
	int voltage;
	String defrostsystem;
	String material;
	String origin;
	int make;
	int weight;
	int length;
	double width;
	double height;
	int price;
	
	public Refrigerator(String brandname, String model, int capacity, String installationtype, String formfactor, String colour, int voltage, 
			String defrostsystem, String material, String origin, int make, int weight, int length, double width, double height, int price) {
		System.out.println("Constructor function is running");
		this.brandname=brandname;
		this.model=model;
		this.capacity=capacity;
		this.installationtype=installationtype;
		this.formfactor=formfactor;
		this.colour=colour;
		this.voltage=voltage;
		this.defrostsystem=defrostsystem;
		this.material=material;
		this.origin=origin;
		this.make=make;
		this.weight=weight;
		this.length=length;
		this.width=width;
		this.height=height;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand name: "+this.brandname+"\nmodel: "+this.model+"\ncapacity: "+this.capacity+"\ninstallationtype:"
        + ""+this.installationtype+"\nformfactor: "+this.formfactor+"\ncolour: "+this.colour+"\nvoltage: "+this.voltage+""
        + "\ndefrostsystem: "+this.defrostsystem+"\nmaterial: "+this.material+"\norigin: "+this.origin+"\nmake: "+this.make+""
        + "\nweight: "+this.weight+"\nlength:"+this.length+"\nwidth: "+this.width+"\nheight: "+this.height+"\nprice: "+this.price);
	}
	public static void main(String[] args) {
		Refrigerator r1=new Refrigerator("Haier","Direct Cool Single Door Refrigerator", 165,"Freestanding","Freezer Top","Red", 220,"Manual","Copper","India", 2023, 29, 62, 53.1, 103.5, 10990);
		r1.display();
		Refrigerator r2=new Refrigerator("Haier","Direct Cool Double Door Refrigerator", 330,"Freestanding","Freezer Top","Blue", 440,"Automatic","Aluminium","India", 2023, 58, 124, 106.2, 207.1, 22990);
		r2.display();
	}

}
