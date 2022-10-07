/*
1. The program checks if any of the arrays' values are equal to the other's.
2. The program keeps on running until it has every possible combination, not when a duplicate number is found.
3.
FLAG = false
loop N from 0 to 4
    loop M from 0 to 4
        if A[N]=B[M]
            FLAG=true
            break
        end if
    end loop
end loop

output FLAG
 */

public class Main {
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 7, 8, 9, 10};

        boolean FLAG = false;
        for (int i : A)
            for (int j : B)
                if (i == j)
                {
                    FLAG = true;
                    break;
                }
        System.out.println(FLAG);
    }
}