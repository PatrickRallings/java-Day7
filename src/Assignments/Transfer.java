package Assignments;

public class Transfer {
    BankAccount sender;
    BankAccount receiver;
    Double amount;
    boolean transferComplete = false;

    public Transfer(BankAccount sender,BankAccount receiver,double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }
    public void send(){
        this.sender.setBalanceWithdrawal(this.amount);
        this.receiver.setBalanceDeposit(this.amount);
        this.transferComplete = true;
    }
}
