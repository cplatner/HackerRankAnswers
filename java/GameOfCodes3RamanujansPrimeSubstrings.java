import java.io.*;
import java.util.*;

public class GameOfCodes3RamanujansPrimeSubstrings
{
    public static void main(String[] args)
    {
        countPrimesInString(readStdin());
        // countPrimesInString(new String[] {"1", "1333657" });
        // countPrimesInString(new String[] {"2", "1333657", "13" });
        // countPrimesInString(new String[] {"3", "1333657", "13", "999219921111234" });

        // for (int i = 0; i < 30; i++) {
        //     testPrime(i);
        // }
        // testPrime(99);
    }

    public static void countPrimesInString(String[] args)
    {
        if (args.length <= 1) {
            return;
        }

        int count = Math.min(Integer.parseInt(args[0]), 10);
        String[] cases = new String[count];
        for (int i = 0; i < count; i++) {
            cases[i] = args[i + 1];
        }

        for (String testcase : cases) {
            Set<String> unique = new HashSet<>();
            //* break into substrings
            String substr;
            int len = testcase.length();
            for (int i = 0; i < len; i++) {
                for (int j = i; j < Math.min(len, i + 6); j++) {
                    // if (j - i + 1 <= 6) {
                        substr = testcase.substring(i, j + 1);
                        unique.add(substr);
                    //    System.out.println (substr);
                    // }
                }
            }

            //* check if substrings are prime
            int primeCount = 0;
            for (String s : unique) {
                // System.out.print(s + ": ");
                if (s.length() > 6) {
                    System.out.println(s);
                }

                int n = Integer.parseInt(s);
                if (isPrime(n)) {
                    // System.out.print("is prime");
                    primeCount++;
                }
                // System.out.println();
            }

            System.out.println(primeCount);
        }
    }

    public static void testPrime(int n)
    {
        System.out.println(n + (isPrime(n) ? " is " : " is not ") + "prime");
    }

    private static boolean isPrime(int n)
    {
        if (n <= 1) {
            return false;
        }

        int max = (int) Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static String[] readStdin()
    {
        List<String> lines = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            lines.add(input.nextLine());
        }

        return lines.toArray(new String[0]);
    }
}
