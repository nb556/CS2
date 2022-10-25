public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {8, 5, 11, 7, 6};
        boolean changed = true;

        while (changed)
        {
            changed = false;
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr.length-1-i; j++)
                {
                    if (arr[j] > arr[j+1])
                    {
                        swap(arr, j, j+1);
                        changed = true;
                    }
                }
            }
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    static  void swap (int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}