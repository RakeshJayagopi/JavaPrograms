package GenericExample;

public class GenericClass<T> {
	
	T a;
	public GenericClass(T a) {
		this.a=a;
	}
	public void displayProperty() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		GenericClass<String> g=new GenericClass<String>("Hello");
		GenericClass<Integer>g1=new GenericClass<Integer>(10);
	}

}
