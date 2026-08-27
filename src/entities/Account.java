package entities;

public class Account {

    public String holder;
    public Double balance;

    public Account(String holder) {
        this.holder = holder;
        this.balance = balance = 0.0;

    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}