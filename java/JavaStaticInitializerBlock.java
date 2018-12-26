import java.util.Scanner;
import java.io.ByteArrayInputStream;;

//* https://www.hackerrank.com/challenges/java-static-initializer-block/
public class JavaStaticInitializerBlock
{
    static int B;
    static int H;
    static int area;
    static boolean flag;

    static {
        String input = "1\n3";
        // String input = "-1\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try (Scanner scan = new Scanner(System.in)) {
            B = scan.nextInt();
            H = scan.nextInt();

            if (B <= 0 || H <= 0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            } else {
                flag = true;
            }
        }
    }

    public static void main(String[] args)
    {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
