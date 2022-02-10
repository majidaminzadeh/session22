package com.tosan.example1;

public class DepositService {

    public void transfer(Deposit sourceDeposit, Deposit desDeposit, int balance){
        sourceDeposit.setBalance(sourceDeposit.getBalance() - balance);
        desDeposit.setBalance(desDeposit.getBalance() + balance);
    }

    public void transfer(Deposit sourceDeposit, Deposit middleDeposit, Deposit desDeposit, int balance){
        if(sourceDeposit.getBalance() < balance){
            throw new RuntimeException();
        }
        sourceDeposit.setBalance(sourceDeposit.getBalance() - balance);
        desDeposit.setBalance(desDeposit.getBalance() + balance);
    }

    public void transfer(Deposit sourceDeposit1, Deposit sourceDeposit2, Deposit desDeposit1, Deposit desDeposit2, int balance){
        if(sourceDeposit1.getBalance() < balance){
            throw new RuntimeException();
        }
        sourceDeposit1.setBalance(sourceDeposit1.getBalance() - balance);
        desDeposit1.setBalance(desDeposit1.getBalance() + balance);
        sourceDeposit2.setBalance(sourceDeposit2.getBalance() - balance);
        desDeposit2.setBalance(desDeposit2.getBalance() + balance);
    }
}
