public class Main
{
    public static void main(String[] args)
    {
        String[] flights = {"AY664", "BA047", "AF110", "LF554", "AF003", "BA116", "AY101"};
        String[] airlines = {"AY", "UA", "LH"};
        for (String i : flights)
            System.out.println(i);
        System.out.println();

        for (String i : airlines)
            System.out.println(i);
        System.out.println();

        for (String a : airlines)
        {
            System.out.println(a + ":");
        }
    }
}