package Bai3;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    public static void menu() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Create Account");
        System.out.println("2. Display Account Info");
        System.out.println("3. Deposit");
        System.out.println("4. Withdraw");
        System.out.println("5. Sort Account By Name");
        System.out.println("6. Sort Account By Balance");
        System.out.println("7. Exit");
        int choice = 0;
        ArrayList<Account> listAccount = new ArrayList<Account>();

        do {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 7) {
                System.out.println("Not a valid choice. Please try again.");
            }

            switch (choice) {
                case 1:
                    Account acc = new Account();
                    acc.input();
                    listAccount.add(acc);
                    break;
                case 2:
                    if (listAccount.size() == 0) {
                        System.out.println("No account to display");
                    } 
                    else {  
                        System.out.println("2.1. Display All Account");
                        System.out.println("2.2. Display Account By Account Number");
                        int subchoice = input.nextInt();
                        switch(subchoice){
                            case 1:
                                Account.printTitle();
                                for (Account account : listAccount) {
                                        System.out.println(account.displayAccount());
                                }
                                break;
                            case 2:
                                System.out.println("Enter account number: ");
                                long accNumberDisplay = input.nextLong();
                                Boolean isFound = false;
                                for(int i=0;i<listAccount.size();++i){
                                    if(listAccount.get(i).getAccNumber() == accNumberDisplay){
                                        isFound = true;
                                        Account.printTitle();
                                        System.out.println(listAccount.get(i).displayAccount());
                                        break;
                                    }
                                }
                                if(isFound == false){
                                    System.out.println("Account not found");
                                    }
                                break;
                            default:
                                break;
                            }
                        }
                    break;
                case 3:
                    System.out.println("Enter account number: ");
                    long accNumberDeposit = input.nextLong();
                    boolean isFound = false;
                    for (Account account : listAccount) {
                        if (account.getAccNumber() == accNumberDeposit) {
                            isFound = true;
                            System.out.println("Enter amount to deposit: ");
                            double amount = input.nextDouble();
                            account.deposit(amount);
                            break;
                        }
                    }
                    if (isFound == false) {
                        System.out.println("Account not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter account number: ");
                    long accNumberWithdraw = input.nextLong();
                    boolean isFound1 = false;
                    for (Account account : listAccount) {
                        if (account.getAccNumber() == accNumberWithdraw) {
                            isFound1 = true;
                            System.out.println("Enter amount to withdraw: ");
                            double amount = input.nextDouble();
                            account.withdraw(amount);
                            break;
                        }
                    }
                    if(isFound1 == false){
                        System.out.println("Account not found");
                    }
                    break;
                case 5:
                if(listAccount.size() == 0){
                    System.out.println("No account to sort");
                }else{
                    ArrayList<Account> listAccountByName = new ArrayList<Account>();
                    listAccountByName = (ArrayList) listAccount.clone();
                    Collections.sort(listAccountByName, Account.compareByName);
                    // System.out.println("Sort by name successfully");
                    Account.printTitle();
                    for (Account account : listAccountByName) {
                        System.out.println(account.displayAccount());
                    }
                }
                break;
                case 6:
                if(listAccount.size() == 0){
                    System.out.println("No account to sort");
                }else{
                    ArrayList<Account> listAccountByBalance = new ArrayList<Account>();
                    listAccountByBalance = (ArrayList) listAccount.clone();
                    Collections.sort(listAccountByBalance, Account.compareByBalance);
                    // System.out.println("Sort by name successfully");
                    Account.printTitle();
                    for (Account account : listAccountByBalance) {
                        System.out.println(account.displayAccount());
                    }
                }
                break;
                case 7:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice >= 1 && choice < 7);
    }
}
