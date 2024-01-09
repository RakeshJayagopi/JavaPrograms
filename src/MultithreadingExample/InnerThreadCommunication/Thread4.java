package MultithreadingExample.InnerThreadCommunication;

public class Thread4 extends Thread {

    Business a;
	public Thread4(Business a) {
		this.a=a;
	}
	public void run() {
		a.demand(15000);
		
	}

}
