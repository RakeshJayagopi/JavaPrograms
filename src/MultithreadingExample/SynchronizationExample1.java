package MultithreadingExample;

public class SynchronizationExample1  extends Thread{

	TableProgram t;
	public SynchronizationExample1(TableProgram t) {
		this.t=t;
	}
	public void run() {
		t.table(10);
	}
	
	public static void main(String[] args) {
		TableProgram tableObject=new TableProgram();
		SynchronizationExample1 thread1=new SynchronizationExample1(tableObject);
		SynchronizationExample2 thread2=new SynchronizationExample2(tableObject);
		thread2.start();
		thread1.start();
	}
}
