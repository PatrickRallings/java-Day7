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
        if (this.sender.balance > this.amount) {
            this.sender.setBalanceWithdrawal(this.amount);
            this.receiver.setBalanceDeposit(this.amount);
            this.transferComplete = true;
        } else{
            System.out.println(this.sender + " balance does not meet the requirements of this transaction.");
        }
    }
}
