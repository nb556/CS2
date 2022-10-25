public class Main
{
    public static void main(String[] args)
    {
        int[] data = {5, 11, 43, 12, 55};

        for (int i = 0; i <= data.length - 2; i++)
        {
            int indSmallest = i;
            for (int j = i + 1; j < data.length; j++)
            {
                if (data[indSmallest] > data[j])
                    indSmallest = j;
            }
            swap(data, i, indSmallest);
        }
        for (int i : data)
            System.out.print(" "+i);
    }

    static  void swap (int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

