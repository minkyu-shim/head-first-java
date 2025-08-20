public class Main {
    public static void main(String[] args) {
        System.out.println(Bank.NAME); // static field accessed via class

        BankAccount a = new BankAccount("Alice", 200);
        BankAccount b = new BankAccount("Bob"); // uses default min opening balance

        System.out.println(a);
        System.out.println(b);

        // --- Static vs. instance fields ---
        // Predict: does the next line compile?
        // System.out.println(BankAccount.balance); // ❌ instance field; uncomment to see error

        a.deposit(50);     // instance method
        b.deposit(1000);   // triggers a small 'bonus' from a local variable

        // --- Static method using objects ---
        BankAccount.transfer(b, a, 200);

        System.out.println(a);
        System.out.println(b);

        // --- Local vs. instance variable (shadowing) ---
        a.demoShadowing();

        // --- final instance field: cannot be reassigned ---
        // a.accountNumber = 999; // ❌ uncomment to see compile error

        // --- final variable holding an object reference ---
        final BankAccount c = new BankAccount("Cara", 100);
        c.deposit(20);           // ✅ allowed: object state can change
        // c = new BankAccount("Clone", 50); // ❌ cannot reassign final reference

        // --- Static utility class pattern ---
        // MathUtils u = new MathUtils(); // ❌ private constructor; cannot instantiate
        int clamped = MathUtils.clamp(42, 0, 10);
        System.out.println("Clamped: " + clamped);

        // --- Static bank-wide behavior ---
        Bank.applyAnnualInterest(a);
        Bank.applyAnnualInterest(b);
        System.out.println(a);
        System.out.println(b);

        // Change the shared interest rate and apply again
        Bank.setAnnualInterestRate(0.10); // 10%
        Bank.applyAnnualInterest(a);
        System.out.println("After 10% interest on 'a': " + a);
    }
}
