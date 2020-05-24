
class Account {
	private double balance = 0;
	
	public void debit(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public void credit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
	
	public void showBalance() {
		System.out.println("Current balance - " + balance);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Account al;
		
		al = new Account();
		
		al.credit(2000);
		al.debit(1000);
		
		al.showBalance();
		
		al.debit(-2000);
		al.showBalance();
	}

}
