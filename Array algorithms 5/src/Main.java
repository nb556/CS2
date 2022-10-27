public class Main
{
    public static void main(String[] args)
    {
        int[] array = {9, 7, 2, 11};
        int I = 1, J, N = array.length, val;
        // N=4 I=1

        while (I < N)
        {
            val = array[I];
            J=I-1;

            while(J>=0 && array[J] > val)
            {
                array[J+1] = array[J];
                J--;
            }

            array[J+1] = val;
            I++;
        }

        for (int i : array)
            System.out.println(i);
    }
}

// The order of growth is 