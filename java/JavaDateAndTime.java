import java.io.*;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

//* https://www.hackerrank.com/challenges/java-date-and-time/
public class JavaDateAndTime
{
    public static void main(String[] args) throws IOException
    {
        String input = "08 05 2015"; // WEDNESDAY
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // try (BufferedWriter writer = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
                String[] firstMultipleInput = reader.readLine().replaceAll("\\s+$", "").split(" ");
                int month = Integer.parseInt(firstMultipleInput[0]);
                int day = Integer.parseInt(firstMultipleInput[1]);
                int year = Integer.parseInt(firstMultipleInput[2]);
                String res = Result.findDay(month, day, year);
                writer.write(res);
                writer.newLine();
            }
        }
    }
}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //* -----8< snip -----
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek()
            .getDisplayName(TextStyle.FULL, Locale.getDefault())
            .toUpperCase();
        //* -----8< snip -----
    }
}
