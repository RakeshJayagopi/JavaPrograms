package MultithreadingExample.InnerThreadCommunication;

public class Thread2 extends Thread {

	Bank b;
	
	public Thread2(Bank b) {
		this.b=b;
	}
	public void run() {
		b.withdraw(12000);
		
	}
}
