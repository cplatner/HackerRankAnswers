//* https://www.hackerrank.com/challenges/jumping-on-the-clouds/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds
{

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c)
    {
        int jumps = 0;

        int cloud = 0;

        while (cloud < c.length) {
            if (cloud + 2 < c.length && c[cloud + 2] == 0) {
                jumps++;
                cloud += 2;
            }
            else if (cloud + 1 < c.length && c[cloud + 1] == 0) {
                jumps++;
                cloud += 1;
            }
            else {
                break;
            }
        }

        return jumps;
    }

    public static void main(String[] args) throws IOException
    {
        // System.out.println (jumpingOnClouds(new int [] { 0, 0, 1, 0, 0, 1, 0 }));
        // System.out.println (jumpingOnClouds(new int [] { 0, 0, 0, 0, 1, 0 }));
        _main(args);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void _main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
