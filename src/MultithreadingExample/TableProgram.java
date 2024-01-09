package MultithreadingExample;

public class TableProgram {

	public synchronized void table(int number) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+number+"="+(i*number));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
