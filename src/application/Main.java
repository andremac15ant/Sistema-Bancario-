package application;

import entities.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        Account account = null;

        double totalwithdrawls = 0.0, totaldeposits = 0.0;

        while (option != 5) {

            System.out.println("\n---MENU---\n1 - Created an Account\n2 - Deposit\n3 - Withdraw\n4 - Account statement\n5 - Exit\n");

            option = sc.nextInt();
            double amount = 0;

                switch (option) {
                        case 1:
                            System.out.print("\nEnter holder name: \n");
                            String holder = sc.next();

                            account = new Account(holder);
                            break;

                        case 2:
                            if (account != null) {
                                System.out.print("\nEnter amount to Deposit: \n");
                                amount = sc.nextDouble();
                                account.deposit(amount);
                                totaldeposits += amount;
                            }
                            else{
                                System.out.println("\nCreated a Account\n");
                            }
                            break;

                        case 3:
                            if (account != null) {
                                System.out.print("\nEnter amount to Withdraw: \n");
                                amount = sc.nextDouble();
                                if (amount <= account.balance) {
                                    account.withdraw(amount);
                                    totalwithdrawls += amount;
                                } else {
                                    System.out.println("\nInsufficient funds!\n");
                                }
                            }
                            else{
                                System.out.println("\nCreated a Account\n");
                            }
                            break;

                        case 4:
                            if (account != null) {
                                System.out.printf("\n---%s---\nBalance:%.2f\nTotal Withdrawals:%.2f\nTotal Deposits:%.2f\n", account.holder, account.balance, totalwithdrawls, totaldeposits);
                            }
                            break;

                        case 5:
                            break;

                        default:
                            System.out.println("\nInvalid option\n");
                    }
                }
                sc.close();
            }
        }