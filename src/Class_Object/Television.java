package Class_Object;

public class Television {
	
	String brandname="Samsung";
	String model="Crystal iSmart 4K Ultra HD Smart LED TV";
	int screensize=43;
	int diameter=6;
	double width=96.4;
	double height=55.9;
	int make=2023;
	int memory=8;
	int ram=2;
	String operatingsystem="Tizen";
	String processor="Crystal Processor 4K";
	double weight=7.7;
	int price=32990;
	public void multimedia() {
		System.out.println("multimedia");
	}
	public void programming() {
		System.out.println("programming");
	}
	public void broadcasting() {
		System.out.println("broadcasting");
	}
	public void channels() {
		System.out.println("channels");
	}
	public void setProperties(int screensize, int diameter, double width, double height, int memory, int ram, double weight, int price) {
		this.screensize=screensize;
		this.diameter=diameter;
		this.width=width;
		this.height=height;
		this.memory=memory;
		this.ram=ram;
		this.weight=weight;
		this.price=price;
	}
	public void displayProperty() {
		System.out.println(brandname+model+screensize+diameter+width+height+make+memory+ram+operatingsystem+processor+weight+price);
	}
	public static void main(String args[]) {
		Television television1=new Television();
		System.out.println(television1.brandname);
		television1.setProperties(50, 12, 99.2, 57.1, 16, 4, 14.8, 39990);
		television1.displayProperty();
		Television television2=new Television();
		System.out.println(television2.brandname);
		television2.displayProperty();
	}
}
