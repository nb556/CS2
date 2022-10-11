public class Main
{
    public static void main(String[] args)
    {
        int[] data = {-50, 40, 30, 0, 55};
        int lo = 0, hi = data.length -1;
        int key = 1;

        int[] search = data;

        boolean found = false;
        int mid = (lo+hi)/2;

        while (!found && lo <= hi)
        {
             mid = (lo+hi)/2;
             if (data[mid] == key)
             {
              found = true;
              System.out.println(mid);
             }
             else if (data[mid] > key)
              lo = mid + 1;

             else
              hi = mid -1;


        }
    }
}