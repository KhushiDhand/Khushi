import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.*;

public class DataAbstractionTest {
    @Before
    public void setUp() {
    }

    @Test
    public void depositToString() {
        Date date = new Date();
        double amount = 50.25;
        String accountNo = "Saving";
        Customer c1 = new Customer("Khushi", 2009723, 100.00, 100.00);
        Deposit d = new Deposit(50.25, date, "Saving");
        String expected = "Deposit of: $" + amount + " Date: " + date + " into account: " + accountNo;
        assertEquals(expected, d.toString());
        System.out.println(expected);
    }

    @Test
    public void withdrawToString() {
        Date date = new Date();
        double amount = 50.25;
        String accountNo = "Checking";
        Customer c1 = new Customer("Khushi", 2009723, 100.00, 100.00);
        Withdraw w = new Withdraw(50.25, date, "Checking");
        String expected = "Withdraw of: $" + amount + " Date: " + date + " from account: " + accountNo;
        assertEquals(expected, w.toString());
        System.out.println(expected);
    }

    @Test
    public void customerDeposit() {
        Date date = new Date();
        Customer c1 = new Customer("Khushi", 2009723, 100.00, 100.00);
        c1.deposit(50.00, date, "Checking");
        assertEquals(150.00, c1.getCheckBalance(), 0.00);
    }

    @Test
    public void customerWithdraw() {
        Date date = new Date();
        Customer c2 = new Customer("Khushi", 2009723, 100.00, 100.00);
        c2.withdraw(50.00, date, "Saving");
        //THIS INCLUDES AN OVERDRAFT CONDITION AND SO IT AFFECTS THE TOTAL AVAILABLE BALANCE
        assertEquals(150.00, c2.getSavingBalance(),0.00);
        }
    }


