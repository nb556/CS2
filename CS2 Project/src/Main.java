import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clear = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        String[] words = {"klingon", "belfast", "xavier",  "abacus", "chronological", "arkansas", "compile"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        ArrayList<ArrayList<String>> lists = new ArrayList<>();

        while (true){
            System.out.println(clear + "To start a task, enter 'sort', 'search' or 'list'");
            String prompt = scanner.next();
            if (prompt.equals("stop") || prompt.equals("!") || prompt.equals("break"))
                break;
            if (prompt.equals("search")) {
                if (BubbleSort.isSorted(list)) {
                    while (true) {
                    System.out.println(clear+"Enter '!' to go back\n\nPlease enter a keyword");
                    prompt = scanner.next();
                    if (prompt.equals("!"))
                        break;
                    System.out.println(Search.BinarySearch(list, prompt));
                    scanner.next();
                    }
                }
                else {
                    System.out.println(clear+"The list isn't sorted");
                    scanner.next();
                }
            } else if (prompt.equals("sort")) {
                BubbleSort.sortString(list);
                System.out.println(clear+"Sorted");
                scanner.next();
            } else if (prompt.equals("list")) {
                for (String i : list)
                    System.out.print(i + " ");
                scanner.next();
            } else if (prompt.equals("new list")) {
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