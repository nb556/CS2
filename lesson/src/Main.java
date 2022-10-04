public class Main
{
    public static void main(String[] args)
    {
        int length = 8;
        for (int row = 0; row <= length; row++)
        {
                for (int j = 0; j <= row; j++)
                    if (row % 2 == 0)
                        System.out.print("*");
                    else
                        System.out.print("-");
                System.out.println("");
        }
    }
}