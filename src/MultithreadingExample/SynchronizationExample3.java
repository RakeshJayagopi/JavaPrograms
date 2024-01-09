package MultithreadingExample;

public class SynchronizationExample3 extends Thread{
	
	TableProgram1 y;
	public SynchronizationExample3(TableProgram1 y) {
		this.y=y;
	}
	public void run() {
		y.table(5);
	}
	public static void main(String[] args) {
		TableProgram1 tableObj=new TableProgram1();
		SynchronizationExample3 thread3=new SynchronizationExample3(tableObj);
		SynchronizationExample4 thread4=new SynchronizationExample4(tableObj);
		thread3.start();
		thread4.start();
	}

}
