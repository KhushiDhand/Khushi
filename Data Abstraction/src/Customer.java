import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //getters and setters
    public int getOVERDRAFT() {
        return OVERDRAFT;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    public void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }
    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(ArrayList<Deposit> deposits) {
        this.deposits = deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public void setWithdraws(ArrayList<Withdraw> withdraws) {
        this.withdraws = withdraws;
    }

    Customer(){
        this.name = "";
        this.accountNumber = 0;
        this.checkBalance = 0.00;
        this.savingBalance = 0.00;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    public double deposit(double amt, Date date, String account){
        if (amt<0){
            System.out.println("The amount should be above $0");
        }
        else if (amt > 0 && (account == CHECKING || account == "Checking")) {
            checkBalance = checkBalance + amt;
            return checkBalance;
        } else if(amt > 0 && (account == SAVING || account == "Saving")){
            savingBalance = savingBalance + amt;
            return savingBalance;
        }
       else{
            System.out.println("The account does not exist");
        }
        return 0;
    }

    public double withdraw(double amt, Date date, String account){
        if(amt > 0.00){
            if(checkOverdraft(amt, account)){
                if(account==CHECKING || account=="Checking"){
                    checkBalance = (checkBalance-(OVERDRAFT)) - amt;
                }
                else if (account=="Saving" || account==SAVING){
                    savingBalance = (savingBalance-(OVERDRAFT)) - amt;
                }
            }
            else {
                if(account==CHECKING || account=="Checking"){
                    checkBalance = (checkBalance-(OVERDRAFT)) - amt;
                }
                else if (account=="Saving" || account==SAVING){
                    savingBalance = (savingBalance-(OVERDRAFT)) - amt;
                }
            }
        }
        return 0;
    }

    private boolean checkOverdraft(double amt, String account){
        if (account == SAVING || account == "Saving") {
            double tempTotal = savingBalance - (OVERDRAFT);
            if(amt >  tempTotal){
                return false;
            }
            else{
                return true;
            }
        }
        else if (account == CHECKING || account == "Checking") {
            double tempTotal = checkBalance - (OVERDRAFT);
            if(amt > tempTotal) {
                return false;
            } else{
                return true;
            }
        }
        else{
            System.out.println("The account does not exist");
        }
        return false;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}