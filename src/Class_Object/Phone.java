package Class_Object;

public class Phone {
	
	String brandname="Apple";
	String model="iPhone 15 Pro";
	String build="Titanium";
	String color="Black";
	int make=2023;
	String operatingsystem="iOS 17";
	double length=146.6;
	double width=70.6;
	double height=8.3;
	int weight=187;
	double screendisplay=6.1;
	int resolution=1179*2556;
	String processor="Apple A17 Pro";
	int ram=8;
	int memory=128;
	int price=134999;
	public void multimedia() {
		System.out.println("multimedia");
	}
	public void programming() {
		System.out.println("programming");
	}
	public void browsing() {
		System.out.println("browsing");
	}
	public void datastorage() {
		System.out.println("datastorage");
	}
	public void setProperties(String color,int ram,int memory,int price,String model,String build,double length,double width,double height,int weight,double screendisplay,int resolution) {
		this.color=color;
		this.ram=ram;
		this.memory=memory;
		this.price=price;
		this.model=model;
		this.build=build;
		this.length=length;
		this.width=width;
		this.height=height;
		this.weight=weight;
		this.screendisplay=screendisplay;
		this.resolution=resolution;
	}
	public void displayProperty() {
		System.out.println(brandname+model+build+color+make+operatingsystem+length+width+height+
				weight+screendisplay+resolution+processor+ram+memory+price);
	}
	public static void main(String args[]) {
		Phone phone1=new Phone();
		System.out.println(phone1.brandname);
		phone1.setProperties("white",10,230,150000,"Apple iPhone 15 Pro Max","Titanium", 159.9, 76.7, 8.3, 221, 6.7, 1290*2796);
		phone1.displayProperty();
		Phone phone2=new Phone();
		System.out.println(phone2.brandname);
		phone2.displayProperty();
		
	}
}