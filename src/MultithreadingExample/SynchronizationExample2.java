package MultithreadingExample;

public class SynchronizationExample2 extends Thread{
	TableProgram t;
	public SynchronizationExample2(TableProgram t) {
		this.t=t;
	}
	public void run() {
		t.table(7);
	}
}
