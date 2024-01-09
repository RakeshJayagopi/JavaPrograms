package MultithreadingExample.InnerThreadCommunication;

public class Main {
public static void main(String[] args) {
	Bank b=new Bank(10001,"rakesh",10000);
	Thread1 t1=new Thread1(b);
	Thread2 t2=new Thread2(b);
	t2.start();
	t1.start();
	
}
}
