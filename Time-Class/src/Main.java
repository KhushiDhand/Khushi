import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Previous Second
        Time previousSecond = new Time(3, 59, 9);
        previousSecond.previousSecond();
        System.out.println("The new time after: " + previousSecond.toString());

        Time nextSecond = new Time(3, 59, 59);
        nextSecond.nextSecond();
        System.out.println("The new time after: " +nextSecond.toString());


    }
}
