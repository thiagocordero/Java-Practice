public class Transactions {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.setAccNumber(1111);
		acc1.openAccount("CHECKINGS", "USER1");
		acc1.withdraw(50);
		acc1.closeAccount();
		acc1.info();
		
		BankAccount acc2 = new BankAccount();
		acc2.setAccNumber(2222);
		acc2.openAccount("SAVINGS", "USER2");
		acc2.deposit(500);
		acc2.withdraw(1000);
		acc2.info();
	}

}
