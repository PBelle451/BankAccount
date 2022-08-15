package co.pedrobelle.curso.Ex37;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account data: ");
        System.out.println("Number: ");
        int number = scanner.nextInt();
        System.out.println("Holder: ");
        String holder = scanner.next();
        System.out.println("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);
        System.out.println("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.getBalance() == 0){
            System.out.println("Broke ass bitch");
        } else if (amount > account.getWithdrawLimit()){
            System.out.println("Withdraw error: The amount exceeds withdraw limit");
        } else if(amount > account.getBalance()){
            System.out.println("Withdraw error: Not enough balance");
        }
        else {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        }
    }
}
