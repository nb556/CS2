import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);

        Scanner scanner = new Scanner(System.in); // read from user
        while(scanner.hasNextInt ())
           list.add(scanner.nextInt ());

        System.out.println(list);
    }
}