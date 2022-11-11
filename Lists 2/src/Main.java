import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String word = scanner.next();
            if (word.equals("!"))
                System.exit(0);
        }

    }
}