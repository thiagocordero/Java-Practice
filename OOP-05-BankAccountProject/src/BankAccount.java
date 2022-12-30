import java.util.Scanner;

public class BankAccount {
	
	// ATTRIBUTES
	public int accNumber;
	protected String accType;
	private String accHolder;
	private float accBalance;
	private boolean status;

	// GENERAL METHODS
	Scanner teclado = new Scanner(System.in);
	
	// Info:
	public void info() {
		System.out.println("ACCOUNT INFORMATION");
		System.out.println("Number: " + this.getAccNumber());
		System.out.println("Type: " + this.getAccType());
		System.out.println("Holder: " + this.getAccHolder());
		System.out.println("Balance: " + this.getAccBalance());
		System.out.println("Status: " + this.getStatus());
		System.out.println("-----------------------");
	}
	
	// Open Account RF01: Holder gets $50 for opening checkings or $150 for opening savings
	// Open Account RF02: Status changes to "true" to indicate that the account is open.
	public void openAccount(String type, String name) {
		this.setAccType(type);
		this.setAccHolder(name);
		this.setStatus(true);
		
		if (type.equals("CHECKINGS")) {
			this.setAccBalance(50);	
		} else if (type.equals("SAVINGS")) {
			this.setAccBalance(150);
		}
	}
	
	public void openAccount() {
		System.out.println("What's you name?");
		String name = teclado.nextLine();
		
		this.setAccHolder(name);
		this.setStatus(true);
		this.setAccNumber(accNumber);
		
		System.out.print("Account Type [1 - Checkings / 2- Savings]: ");
		int option = teclado.nextInt();
		if (option == 1) {
			this.setAccType("CHECKINGS");
			System.out.println("You've just received $50 in your balance for opening an account!");
			this.setAccBalance(50);
		} else if (option == 2) {
			this.setAccType("SAVINGS");
			System.out.println("You've just received $150 in your balance for opening an account!");
			this.setAccBalance(150);
		} else {
			System.out.println("ERROR: Invalid Number");
		}
		
	}
	
	// Close Account RF01: There can't be any money left nor debts before closing an account
	public void closeAccount() {
		if (this.getAccBalance() > 0) {
			System.out.println("You must withdraw all money before closing an account.");
		} else if (this.getAccBalance() < 0) {
			System.out.println("You must pay all debts before closing an account");
		} else {
			System.out.println("Are you sure you want to close your account? [1-YES / 2-NO] ");
			int option = teclado.nextInt();
			if (option == 1) {
				System.out.println("Closing your account...");
				this.setStatus(false);
			} else {
				System.out.println("Returning to the main page...");
			}
		}
	}
	
	// Deposit RF1: Account must exist
	// Deposit RF2: Balance must be enough
	public void deposit(float value) {
		if (this.getStatus()) {
			this.setAccBalance(this.getAccBalance() + value); 
			System.out.println("Successful deposit to " + this.getAccHolder());
		} else {
			System.out.println("ERROR: Account doesn't exist!");
		}
	}
	
	// Withdraw RF1: Account must exist
	// Withdraw RF2: Balance must be enough
	public void withdraw(float value) {
		if (this.getStatus() == true) {
			if (this.getAccBalance() >= value) {
				this.setAccBalance(this.getAccBalance() - value);
				System.out.println("Successful withdraw from " + this.getAccHolder() + "'s account.");
			} else {
				System.out.println("ERROR: Balance is not enough to withdraw!");	
			}
		} else {
			System.out.println("ERROR: Account doesn't exist!");			
		}
	}
	
	// monthlyTaxes RF1: Takes the value from the current balance ($12 CA / $20 SA)
	public void monthlyTaxes() {
		int payment = 0;
		if (this.getAccType().equals("CHECKINGS")) {
			payment = 12;
		} else if (this.getAccType().equals("SAVINGS")) {
			payment = 20;
		}
		if (this.getStatus()) {
			System.out.println("Thank you for your payment of $" + payment);
			this.setAccBalance(this.getAccBalance() - payment);
		}
		
	}
	
	// CONSTRUCTORS
		public BankAccount() {
			this.setAccBalance(0); 
			this.setStatus(false);;
		}
		
		// GETTERS AND SETTERS
		public int getAccNumber() {
			return accNumber;
		}
		public void setAccNumber(int number) {
			this.accNumber = number;
		}
		
		public String getAccType() {
			return accType;
		}
		public void setAccType(String type) {
			this.accType = type;
		}

		public String getAccHolder() {
			return accHolder;
		}
		public void setAccHolder(String accHolder) {
			this.accHolder = accHolder;
		}

		public float getAccBalance() {
			return accBalance;
		}
		public void setAccBalance(float accBalance) {
			this.accBalance = accBalance;
		}
		
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
}
