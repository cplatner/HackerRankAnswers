import java.util.*;
import java.io.*;

//* https://www.hackerrank.com/challenges/java-datatypes/
public class JavaDatatypes
{
    public static void main(String[] args)
    {
        //* uncomment for submission: testDatatypes();
        _testMain(args);
    }

    private static void _testMain(String[] args)
    {
        String input = "5\n-150\n150000\n1500000000\n213333333333333333333333333333333333\n-100000000000000\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        testDatatypes();
        System.setIn(System.in);
    }

    private static void testDatatypes()
    {
        //* -----8< snip -----
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
        scan.close();
        //* -----8< snip -----
    }
}
