import java.util.ArrayList;

public class BubbleSort {
    int[] arr;
    ArrayList<String> words = new ArrayList<>();

    BubbleSort(int[] arr, ArrayList<String> words) {
        this.arr = arr;
        this.words = words;
    }

    static void sortInt(int[] arr) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swapInt(arr, j, j + 1);
                        changed = true;
                    }
                }
            }
        }
    }

    static void sortString(ArrayList<String> words) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < words.size(); i++) {
                for (int j = 0; j < words.size() - 1 - i; j++) {
                    if (words.get(j).compareTo(words.get(j + 1)) < 1) {
                        swapString(words, i, j);
                        changed = true;
                    }
                }
            }
        }
    }

    static  void swapInt(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    static  void swapString(ArrayList<String> words, int i, int j)
    {
        String tmp = words.get(i);
        words.add(i, words.get(j));
        words.add(j, tmp);
    }
}