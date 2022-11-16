import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clear = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        ArrayList<ArrayList<String>> lists = new ArrayList<>();

        while (true){
            System.out.println(clear + "To start a task, enter 'sort', 'search', 'list' or 'newlist'");
            String prompt = scanner.next();


            if (prompt.equals("stop") || prompt.equals("!") || prompt.equals("break"))
                break;
            if (prompt.equals("search")) {
                if (BubbleSort.isSorted(lists.get(0))) {
                    while (true) {
                    System.out.println(clear+"Enter '!' to go back\n\nPlease enter a keyword");
                    prompt = scanner.next();
                    if (prompt.equals("!"))
                        break;
                    System.out.println(Search.BinarySearch(lists.get(0), prompt));
                    scanner.next();
                    }
                }
                else {
                    System.out.println(clear+"The list isn't sorted");
                    scanner.next();
                }
            } else if (prompt.equals("sort")) {
                BubbleSort.sortString(lists.get(0));
                System.out.println(clear+"Sorted");
                scanner.next();
            } else if (prompt.equals("list")) {
                for (String i : lists.get(0))
                    System.out.print(i + " ");
                scanner.next();
            } else if (prompt.equals("newlist")) {
                lists.add(new ArrayList<String>());
                System.out.println(clear + "Enter any words into the list\n\nEnter '!' to go back");
                while (true) {
                    prompt = scanner.next();
                    if (prompt.equals("!"))
                        break;
                    lists.get(lists.size()-1).add(prompt);
                }
            }
        }
    }
}