package MultithreadingExample;

public class SynchronizationExample4 extends Thread{

	TableProgram1 y;
	public SynchronizationExample4(TableProgram1 y) {
		this.y=y;
	}
	public void run() {
		y.table(9);
	}
}
