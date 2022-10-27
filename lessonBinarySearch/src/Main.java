public class Main
{
    public static void main(String[] args)
    {
        int[] data = {-50, 0, 30, 40, 55, 66, 77, 88, 99, 100};
        int lo = 0, hi = data.length -1;
        int key = 66;

        boolean found = false;
        int mid;

        while (!found && lo <= hi)
        {
             mid = (lo+hi)/2;
             if (data[mid] == key)
             {
              found = true;
              System.out.println("found " + mid);
             }
             else if (data[mid] > key)
                 hi = mid -1;
             else
                 lo = mid + 1;
        }
    }
}