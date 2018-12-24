import java.io.ByteArrayInputStream;
import java.util.Scanner;

//* https://www.hackerrank.com/challenges/java-output-formatting/
public class JavaOutputFormatting 
{
    public static void main(String[] args)
    {
        //* uncomment for submission: formatOutput();
        _testMain(args);
    }

    private static void _testMain(String[] args)
    {
        String input = "java 100\ncpp 65\npython 50";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        formatOutput();
        System.setIn(System.in);
    }

    private static void formatOutput() 
    {
        //* -----8< snip -----
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++)
        {
            String s = sc.next();
            int n = sc.nextInt();
            System.out.printf("%-15s%03d\n", s, n);
        }
        System.out.println("================================");
        sc.close();
        //* -----8< snip -----
    }
}
