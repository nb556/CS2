/*
2. The purpose of the program is to find all possible combinations of values where one is
multiplied by ten and another is in the place of single digits excluding values being combined
with themselves.
3. If an inputted number is negative, the results won't be optimal.
 */


public class Main
{
    public static void main(String[] args)
    {
        int[] NUMS = {3, 7, 4};

        int K = 0;

        while (K < NUMS.length)
        {
            int L = 0;

            while (L < NUMS.length)
            {
                if (!(K==L))
                {
                    System.out.println(10*NUMS[K]+NUMS[L]);
                }
                L++;
            }

            K++;
        }
    }
}