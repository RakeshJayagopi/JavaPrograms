package MultithreadingExample.InnerThreadCommunication;

public class Thread3 extends Thread{
	
	Business a;
	public Thread3(Business a) {
		this.a=a;
	}
	public void run() {
		a.supply(20000);
	}

}
