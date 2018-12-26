import java.util.*;
import java.text.NumberFormat;

//* https://www.hackerrank.com/challenges/java-currency-formatter/
public class JavaCurrencyFormatter
{
    public static void main(String[] args)
    {
        // Scanner scanner = new Scanner(System.in);
        // double payment = scanner.nextDouble();
        // double payment = 12324.134;
        double payment = 0.999;
        // scanner.close();

        //* -----8< snip -----
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        NumberFormat inf = NumberFormat.getNumberInstance(Locale.US);
        inf.setMaximumFractionDigits(2);
        inf.setMinimumFractionDigits(2);
        String india = String.format("Rs.%s", inf.format(payment));
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        //* -----8< snip -----

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
