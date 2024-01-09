package MultithreadingExample.InnerThreadCommunication;

public class Business {
	int customerId;
	String customerName;
	double shares;
	
	public Business (int customerId, String customerName, double shares) {
		System.out.println("Business constructor");
		this.customerId=customerId;
		this.customerName=customerName;
		this.shares=shares;
	}
	public synchronized  void demand(int buyingstock) {
		if(buyingstock>0) {
			this.shares+=buyingstock;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("notify");
			notify();
		}else {
			System.out.println("invalid purchase");
		}
		System.out.println("demand completed");
	}
	public synchronized void supply(int buyingstock) {
		if(buyingstock<=this.shares) {
			this.shares-=buyingstock;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				System.out.println("waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("deal completed");
	}

}
