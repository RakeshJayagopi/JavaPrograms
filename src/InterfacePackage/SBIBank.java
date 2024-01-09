package InterfacePackage;

public  class SBIBank implements Bank {
	int balance;
 public void createAccount() {
	 
 }
 public int getBalance() {
	 return this.balance;
 }
 public void deposit(int amount) {
	 this.balance+=amount;
 }
}
