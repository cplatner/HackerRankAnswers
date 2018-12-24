import java.util.*;
import java.io.*;

//* https://www.hackerrank.com/challenges/java-loops/
public class JavaLoops2
{
    public static void main(String[] args)
    {
        // * uncomment for submission: printMultiples();
        _testMain(args);
    }

    private static void _testMain(String[] args)
    {
        String input = "2\n0 2 10\n5 3 5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        printMultiples();
        System.setIn(System.in);
    }

    private static void printMultiples()
    {
        // * -----8< snip -----
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int[] sums = new int[n];
            sums[0] = a + b;
            for (int j = 1; j < n; j++) {
                sums[j] = (b << j) + sums[j - 1];
            }

            for (int j = 0; j < n; j++) {
                System.out.printf("%d%s", sums[j], j < n - 1 ? " " : "");
            }
            System.out.println();
        }
        scan.close();
        // * -----8< snip -----
    }
}
