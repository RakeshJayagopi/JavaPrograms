package MultithreadingExample.InnerThreadCommunication;

public class Thread1 extends Thread{

	Bank b;
	public Thread1(Bank b) {
		this.b=b;
	}
	public void run() {
		b.deposit(5000);
	}
}
