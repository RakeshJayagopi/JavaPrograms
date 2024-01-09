package MultithreadingExample.InnerThreadCommunication;

public class Main1 {
public static void main(String[] args) {
	Business a=new Business(904892,"Rakesh",30000);
	Thread3 t3=new Thread3(a);
	Thread4 t4=new Thread4(a);
	t3.start();
	t4.start();
}
}
