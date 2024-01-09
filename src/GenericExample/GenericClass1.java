package GenericExample;

public class GenericClass1<T> {

	T b;
	public GenericClass1(T b) {
		this.b=b;
	}
	public void displayProperty() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		GenericClass1<String> g=new GenericClass1<String>("Hello World");
		GenericClass1<Integer> g1=new GenericClass1<Integer>(18);
		GenericClass1<Character> g2=new GenericClass1<Character>('A');
		GenericClass1<Float> g3=new GenericClass1<Float>(40.0F);
		GenericClass1<Double> g4=new GenericClass1<Double>(70.0D);
		GenericClass1<Boolean> g5=new GenericClass1<Boolean>(false);
	}
}
