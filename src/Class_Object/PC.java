package Class_Object;

public class PC {
	
	String name="HP";
	String model="15 Series";
	int make=2023;
	String OS="Windows 11";
	String processor="Intel Core i5 13th Gen";
	String graphics="Intel IrisXe Graphics";
	int ram=16;
	int storage=512;
	double screendisplay=15.6;
	int resolution=1080;
	int price=69999;
	public void programming() {
		System.out.println("programming");
	}
	public void multimedia() {
		System.out.println("multimedia");
	}
	public void videoediting() {
		System.out.println("videoediting");
	}
	public void browsing() {
		System.out.println("browsing");
	}
	public void datastorage() {
		System.out.println("datastorage");
	}
	public void aiassistant() {
		System.out.println("aiassistant");
	}
	public static void main(String args[]) {
		PC pc1=new PC();
		System.out.println(pc1.name);
		PC pc2=new PC();
		System.out.println(pc2.name);
	}
}

