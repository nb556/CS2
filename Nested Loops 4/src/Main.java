public class Main
{
    public static void main(String[] args)
    {
        int length = 6;

        for (int i = length; i >= 0; i--)
        {
            for (int j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            for (int x = i; x < length; x++)
            {
               System.out.print("-");
            }
            System.out.println();
        }
    }
}