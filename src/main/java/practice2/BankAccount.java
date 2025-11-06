package practice_2;

public class BankAccount {
    // поля
    String owner;
    double balance;

    // Конструктор
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Геттер для поля owner
    String getOwner(){
        return owner;
    }

    // Геттер для поля balance
    double getBalance() {
        return balance;
    }

    // Сеттер для поля owner
    void setOwner(String owner) {
        this.owner = owner;
    }

    // Метод для внесения денег
    void deposit(double amount) {
        balance += amount;
    }

    // Метод для снятия денег
    void withdraw(double amount) {
        balance -= amount;
    }

    // Метод для вывода текущего баланса
    void printBalance() {
        System.out.println("Баланс: " + balance + ", владелец " + owner);
    }
}
