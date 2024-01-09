package Class_Object;

public class WashingMachine {
	
	String brandname="Whirlpool";
	String type="Semi Auto Top Load";
	String color="Grey";
	String energyrating="5 stars";
	int load=7;
	int spinspeed=1400;
	String build="Plastic";
	double width=80.4;
	double height=95.6;
	int depth=52;
	int weight=30;
	int price=10240;
	public void drying() {
		System.out.println("drying");
	}
	public void washing() {
		System.out.println("washing");
	}
	public void soaking() {
		System.out.println("soaking");
	}
	public void impeller() {
		System.out.println("impeller");
	}
	public void setProperties(String type,String color,String energyrating,int load,int spinspeed,String build,double width,double height,int depth,int weight,int price) {
		this.type=type;
		this.color=color;
		this.energyrating=energyrating;
		this.load=load;
		this.spinspeed=spinspeed;
		this.build=build;
		this.width=width;
		this.height=height;
		this.depth=depth;
		this.weight=weight;
		this.price=price;
	}
	public void displayProperty() {
		System.out.println(brandname+type+color+energyrating+load+spinspeed+build+width+height+depth+weight+price);
	}
	public static void main(String args[]) {
		WashingMachine washingmachine1=new WashingMachine();
		System.out.println(washingmachine1.brandname);
		washingmachine1.setProperties("Full Auto Top Load","Black","4 stars", 14, 2800, "Aluminium", 160.8, 191.2, 104, 60, 20480);
		washingmachine1.displayProperty();
		WashingMachine washingmachine2=new WashingMachine();
		System.out.println(washingmachine2.brandname);
		washingmachine2.displayProperty();
	}

}
