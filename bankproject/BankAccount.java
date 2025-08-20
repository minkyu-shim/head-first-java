public class BankAccount {
	public static final double MIN_OPENING_BALANCE = 50.0;
	
	// Shared across all BankAccount objects
	private static int nextId = 1;
	
	// Belongs to each objects
	private final int accountNumber;
	private String owner; // doesn't it make more sense to make owner final?
	private double balance;
	
	// Constructor chaining
	public BankAccount(String owner) {
		this(owner, MIN_OPENING_BALANCE);
	}
	
	public BankAccount(String owner, double openingBalance) {
		if (openingBalance < MIN_OPENING_BALANCE) {
			throw new IllegalArgumentException("Opening balance must be >= " + MIN_OPENING_BALANCE); 
			// what is this IllegalArgumentException? I think a new class has been made here, doesn't the object need a reference variable?
		}
		this.owner = owner;
		this.accountNumber = nextId++;
		this.balance = openingBalance;
	}
	
	public final int getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwner() { return owner; } // might be because I'm used to python, but seems more logic to do return this.owner. What is the convention?
	public void setOwner(String owner) { this.owner = owner; } // why new constructor here?
	public double getBalance() { return balance; }
	
	public void deposit(double amount) {
		if (amount <= 0) throw new IllegalArgumentException("Deposit must be > 0");
		// local variable bonus, to see local vs instance
		double bonus = 0;
		if (amount > 1000) bonus = 1;
		this.balance += amount + bonus;
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
		if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
		balance -= amount;
		// why this.balance at deposit and just balance here?
	}
	
	// so if it doesn't use 'this' it is static? -> I guess that means it's not using instance variable so yes?
    public static void transfer(BankAccount from, BankAccount to, double amount) {
        if (from == null || to == null) throw new IllegalArgumentException("Accounts cannot be null");
        from.withdraw(amount);
        to.deposit(amount);
    }
	
	// I don't understand what demoShadowing method is for.
    public void demoShadowing() {
        double balance = -1; // local variable shadows the instance field 'balance'
        System.out.println("local balance = " + balance); // I assume -1 here
        System.out.println("instance balance = " + this.balance); // actual balance here
    }
	
	@Override
	public String toString() {
		return String.format("#%d %s: %.2f$", accountNumber, owner, balance);
	}
}