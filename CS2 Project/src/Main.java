import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clear = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        int listIdx = 0;

        while (true) {
            System.out.println(clear);
            if (lists.isEmpty())
                System.out.println("\nType 'newlist' to create your first list ('!' to exit)");
            else {
                System.out.println("\nThe list being accessed is " + listIdx);
                System.out.println("\nTo start a task, enter 'newlist', 'sort', 'search', 'list' or 'setlist' to access a different list ('!' to exit)");
            }
            String prompt = scanner.next();
            if (prompt.equals("!"))
                break;
            if (!(lists.isEmpty())) {
                if (prompt.equals("search")) {
                    if (BubbleSort.isSorted(lists.get(listIdx))) {
                        while (true) {
                            System.out.println(clear + "Please enter a keyword ('!' to go back)");
                            prompt = scanner.next();
                            if (prompt.equals("!"))
                                break;
                            System.out.println(clear + Search.BinarySearch(lists.get(listIdx), prompt));
                            scanner.next();
                        }
                    } else {
                        System.out.println(clear + "The list isn't sorted");
                        scanner.next();
                    }
                } else if (prompt.equals("sort")) {
                    BubbleSort.sortString(lists.get(listIdx));
                    System.out.println(clear + "Sorted");
                    scanner.next();
                } else if (prompt.equals("list")) {
                    System.out.println(clear);
                    for (String i : lists.get(listIdx))
                        System.out.print(i + " ");
                    scanner.next();
                } else if (prompt.equals("setlist")) {
                    System.out.println(clear + "Please input the number of the list you want to access");
                    int input = Integer.parseInt(scanner.next());
                    if (input >= 0 && input < lists.size())
                        listIdx = input;
                    else {
                        System.out.println(clear + "Please input a valid number for the list");
                        scanner.next();
                    }
                }
            }
            if (prompt.equals("newlist")) {
                lists.add(new ArrayList<String>());
                System.out.println(clear + "Enter any words into the list ('!' to go back)");
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