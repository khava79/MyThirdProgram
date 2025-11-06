package practice_2;

public class Main4 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Симпсон", 20000);
        bank.printBalance();

        bank.deposit(3000);
        bank.printBalance();

        bank.withdraw(5000);
        bank.printBalance();
    }
}
