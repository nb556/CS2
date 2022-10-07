public class Main
{
    public static void main(String[] args)
    {
        int key = 2;
        int[] array = {5, 4, 3, 2, 1};
        boolean found = false;

        for (int index = 0; !found && index < array.length; index++)
            if (array[index] == key)
                found = true;

        System.out.println(found);
    }
}