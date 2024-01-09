package MultithreadingExample;

public class TableProgram1 {

	public synchronized void table (int n) {
		for(int i=1;i<20;i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
