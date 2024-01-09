package Class_Object;

public class CookingStove {
	
	String brandname="Butterfly";
	String model="Smart Glass Top 2 Burner Open Gas Stove";
	String type="Manual Ignition";
	String material="Glass";
	String colour="Black";
	String shape="Rectangle";
	int length=60;
	int width=29;
	int height=11;
	int weight=5100;
	public void burner() {
		System.out.println("burner");
	}
	public void controlpanel() {
		System.out.println("controlpanel");
	}
	public void heating() {
		System.out.println("heating");
	}
	public void cooking() {
		System.out.println("cooking");
	}
	public void setProperties(int length, int width, int height, int weight) {
		this.length=length;
		this.width=width;
		this.height=height;
		this.weight=weight;
	}
	public void displayProperty() {
		System.out.println(brandname+model+type+material+colour+shape+length+width+height+weight);
	}
	public static void main(String args[]) {
		CookingStove cookingstove1=new CookingStove();
		System.out.println(cookingstove1.brandname);
		cookingstove1.setProperties(75, 44, 22, 6500);
		cookingstove1.displayProperty();
		CookingStove cookingstove2=new CookingStove();
		System.out.println(cookingstove2.brandname);
		cookingstove2.displayProperty();
	}
}
