import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(15);

        Scanner scanner = new Scanner(System.in); // read from user
        while(scanner.hasNextInt ())
        {
            int val = scanner.nextInt();
            int i = 0;
            while (i < list.size() && list.get (i) > val)
                i++;

            list.add(i, val);
        }

        System.out.println(list);
    }
}