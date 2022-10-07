public class Main
{
    public static void main(String[] args)
    {
        int length = 5;
        for (int i = 1; i <= length; i++)
        {
            for (int j = 1; j <= length; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();


        for (int row = 1; row <= length; row++)
        {
            for (int i = row; i <= row + length-1; i++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}