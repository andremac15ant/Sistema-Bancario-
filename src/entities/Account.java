package entities;

public class Account {

    public String holder;
    public Double balance = 0.0;

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}