package MultithreadingExample;

public class ThreadExample extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" name: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		ThreadExample t1=new ThreadExample();
		System.out.println(t1.getState());
		t1.start();
		ThreadExample t2=new ThreadExample();
		t2.start();
	}

}
