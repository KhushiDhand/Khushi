import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString(){
        return "Withdraw of: $" + amount + " Date: " + date + " from account: " + account;
    }
}