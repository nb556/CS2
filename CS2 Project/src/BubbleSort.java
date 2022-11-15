import java.util.ArrayList;

public class BubbleSort {
    int[] arr;
    ArrayList<String> words;

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
            for (int i = 0; i < words.size() -1; i++) {
                for (int j = 0; j < words.size() -1 -i; j++) {
                    if (words.get(j).compareTo(words.get(j + 1)) > 0) {
                        swapString(words, j, j+1);
                        changed = true;
                    }
                }
            }
        }
    }

    static  void swapInt(int[] arr, int x, int y)
    {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
    static  void swapString(ArrayList<String> words, int i, int j)
    {
        String tmp = words.get(i);
        words.remove(i);
        words.add(i, words.get(j-1));
        words.remove(j);
        words.add(j, tmp);
    }
}