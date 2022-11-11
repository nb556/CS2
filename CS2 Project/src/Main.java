import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner scanner = new Scanner(System.in);
        String[] words = {"abacus", "belfast", "chronological",  "klingon", "xavier"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        while (true){
            System.out.println("\n\n\n\n\n\nIf you want to search, enter 'search'");
            String prompt = scanner.next();
            if (prompt.equals("stop") || prompt.equals("!") || prompt.equals("break"))
                break;
            if (prompt.equals("search")) {
                while (true) {
                    System.out.println("\n\n\nEnter 'back' to go back\n\n");
                    System.out.println("Please enter a keyword");
                    prompt = scanner.next();
                    if (prompt.equals("back"))
                        break;
                    System.out.println(Search.BinarySearch(list, prompt));
                    scanner.next();
                }
            }
        }
    }
}