import java.util.*;

public class CreditCardDebt {
    public static void creditDebt(int c, int mo, int m) {
        int month = m;
        int charge = c;
        int monthly = mo;
        System.out.println("Month " + month + " balance: $" + charge);
        if (charge > monthly) {
            charge -= 100;
            charge *= 1.02;
            System.out.println("New balance with 2% interest after monthly payment of $" + monthly + ": " + charge + "\n");
            month++;
            creditDebt(charge, monthly, month);
        } else {
            System.out.println(month + " months to pay off debt");
            return;
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter charge:");
            int c = input.nextInt();
            System.out.println("Enter monthly payment:");
            int mp = input.nextInt();
            creditDebt(c, mp, 1);
        }
    }
}
