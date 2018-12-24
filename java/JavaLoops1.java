import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//* https://www.hackerrank.com/challenges/java-loops-i/
public class JavaLoops1
{
    public static void main(String[] args)
    {
        //* uncomment for submission: printMultiples();
        _testMain(args);
    }

    private static void _testMain(String[] args)
    {
        String input = "2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        printMultiples();
        System.setIn(System.in);
    }

    private static void printMultiples()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();

        //* -----8< snip -----
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
        //* -----8< snip -----
    }
}
