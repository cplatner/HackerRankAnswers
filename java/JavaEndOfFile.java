import java.util.*;
import java.io.*;

//* https://www.hackerrank.com/challenges/java-end-of-file/
public class JavaEndOfFile
{
    public static void main(String[] args)
    {
        //* uncomment for submission: testEndOfFile();
        _testMain(args);
    }

    private static void _testMain(String[] args)
    {
        String input = "Hello world\nI am a file\nRead me until end-of-file.";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        testEndOfFile();
        System.setIn(System.in);
    }

    private static void testEndOfFile()
    {
        //* -----8< snip -----
        Scanner scan = new Scanner(System.in);
        int lineno = 1;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.printf("%d %s\n", lineno++, line);
        }
        scan.close();
        //* -----8< snip -----
    }
}
