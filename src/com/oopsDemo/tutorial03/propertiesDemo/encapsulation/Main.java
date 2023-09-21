package com.oopsDemo.tutorial03.propertiesDemo.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789");

        account.deposit(1000);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after second withdrawal: " + account.getBalance());
    }
}
