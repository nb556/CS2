import java.util.ArrayList;

public class Search {
    String[] arr;
    String searchFor;
    Search(String[] arr, String searchFor) {
        this.arr = arr;
        this.searchFor = searchFor;
    }

    // non-trivial algorithm
    public static String BinarySearch(ArrayList<String> arr, String searchFor) {
        int lo = 0, hi = arr.size()-1;

        while (lo <= hi) {
            int mid = (lo+hi)/2;
            if (arr.get(mid).equals(searchFor)) {
                return (""+mid);
            }
            else if (searchFor.compareTo(arr.get(mid)) < 0)
                hi = mid -1;
            else
                lo = mid + 1;
        }
        return "Not found";
    }
}
