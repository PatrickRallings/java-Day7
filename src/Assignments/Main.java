package Assignments;

public class Main {
    public static void main(String[] args) {
        //Bank Account Assignment
        BankAccount PatrickR = new BankAccount("Patrick Rallings", 500);
        PatrickR.setBalanceDeposit(100);
        PatrickR.getAccount();
        //Bank Transfer Assignment
        bankTransfer();
        //Product Assignment
        Product keyboard = new Product ("Keyboard", 99.99, 3);
        keyboard.totalCost();
        keyboard.printProduct();
    }
    public static void bankTransfer() {
        BankAccount Matt = new BankAccount("Matt", 5000);
        BankAccount Tim = new BankAccount("Tim", 300);
        Matt.setBalanceWithdrawal(100);
        Tim.setBalanceDeposit(100);
        Matt.getAccount();
        Tim.getAccount();
    }
}
