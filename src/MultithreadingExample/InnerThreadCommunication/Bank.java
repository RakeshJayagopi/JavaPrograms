package MultithreadingExample.InnerThreadCommunication;

public class Bank {
	int customerId;
	String customerName;
	float balance;
	
	public Bank(int customerId, String customerName, float balance) {
		System.out.println("Bank constructor");
		this.customerId=customerId;
		this.customerName=customerName;
		this.balance=balance;
	}
	public synchronized  void deposit(int amount) {
		if(amount>0) {
			this.balance+=amount;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("notify");
			notify();
		}else {
			System.out.println("invalid amount");
		}
		System.out.println("deposit completed");
	}
	public synchronized void withdraw(int amount) {
		if(amount<=this.balance) {
			this.balance-=amount;
			try {
				Thread.sleep(2000);
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
		System.out.println("withdraw completed");
	}

}
