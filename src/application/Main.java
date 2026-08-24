package application;

import entities.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        Account account = null;

        double totalwithdrawls=0.0,totaldeposits=0.0;

        while(option != 5) {

            System.out.print("---MENU---\n1 - Created an Account\n2 - Deposit\n3 - Withdraw\n4 - Account statement\n5 - Exit\n");

            option = sc.nextInt();
            double amount=0;


            if (option == 1) {
                account = new Account();
                System.out.print("Enter holder name: ");
                account.holder = sc.next();
            }

            else if (option == 2 && account != null) {
                System.out.print("Enter amount to Deposit: ");
                amount = sc.nextDouble();
                account.deposit(amount);
                totaldeposits += amount;
            }

            else if (option == 3 && account != null) {
                System.out.print("Enter amount to Withdraw: ");
                amount = sc.nextDouble();
                account.withdraw(amount);
                totalwithdrawls += amount;
            }

            else if (option == 4 && account != null) {
                System.out.printf("---%s---\nBalance:%.2f\nTotal Withdrawals:%.2f\nTotal Deposits:%.2f\n",account.holder,account.balance,totalwithdrawls, totaldeposits);
            }

            else if (option == 5) {
                break;
            }

            else {
                System.out.println("Invalid option");
            }

            }
        sc.close();
        }
    }


