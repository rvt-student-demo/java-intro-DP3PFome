
package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PaymentCard petesCard = new PaymentCard(10.0);

        System.out.println("money " + petesCard.balance());
        Boolean wasSuccessful = petesCard.takeMoney(8.0);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }
}



