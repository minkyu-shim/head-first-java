// final here means there is no subclasses of Bank, am I correct?
public final class Bank {
	public static final String NAME = "Java Bank";
	private static double annualInterestRate = 0.02;
	
	private Bank() {} // prevent instantiation -> WHY??? why not make it static class then
	
	public static double getAnnualInterestRate() { return annualInterestRate; }
	
	public static void setAnnualInterestRate(double rate) {
		if (rate < 0 ) throw new IllegalArgumentException(" Rate must be >= 0");
		annualInterestRate = rate; // why not this.annualInterestRate = rate;
	}
	
	public static void applyAnnualInterest(BankAccount account) {
		double interest = account.getBalance() * annualInterestRate;
		account.deposit(interest);
	}
}