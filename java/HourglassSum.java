import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourglassSum
{
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr)
    {
        //* get array dimensions
        int x = arr.length;
        int y = arr[0].length;
        //* use 2 less for m and n

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < x - 2; i++) {
            for (int j = 0; j < y -2 ; j++) {
                int sum = computeOneSum(arr, i, j);
                // System.out.println(sum);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    static int computeOneSum(int[][] arr, int x, int y)
    {
        // System.out.printf("%d %d %d\n  %d\n%d %d %d\n",
        //     arr[x+0][y+0], arr[x+0][y+1], arr[x+0][y+2],
        //                    arr[x+1][y+1],
        //     arr[x+2][y+0], arr[x+2][y+1], arr[x+2][y+2]);

        int sum = arr[x+0][y+0] + arr[x+0][y+1] + arr[x+0][y+2]
                +                 arr[x+1][y+1]
                + arr[x+2][y+0] + arr[x+2][y+1] + arr[x+2][y+2];

        return sum;
    }

    private static void _testMain(String[] args)
    {
        int[][] multi = new int[][]{
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        testHourglassSum(multi, 19);
    }

    private static void testHourglassSum(final int[][] input, final int expected)
    {
        int  result = hourglassSum(input);

        if (result == expected) {
            System.out.println("PASS: " + result);
        }
        else {
            System.out.println("FAIL: " + result);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        _testMain(args);
        System.exit(0);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
