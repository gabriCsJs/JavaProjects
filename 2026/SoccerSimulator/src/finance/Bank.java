package finance;

import team.Team;

import java.util.ArrayList;

public class Bank {

    private double availableBalance;
    private final ArrayList<Loan> loans;

    public Bank() {
        this.availableBalance = 1000.0;
        this.loans = new ArrayList<>();
    }

    public void setMoney(double amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        }
        else {
            this.availableBalance += amount;
        }
    }

    public void getAvailableBalance(){
        System.out.println(name +"Available Balance: " + this.availableBalance);
    }

    public void transfer(Team team, double amount){
        this.availableBalance -= amount;
        Bank bank = team.getBank();
        bank.availableBalance += amount;
    }

    void newLoan(){

    }

}
