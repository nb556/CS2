import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.addLast(6);
        list.add(1, 0);
        int i = 0;
        while (list.get (i) != 6)
            i++;
        list.remove(i);
        list.removeFirst();

        System.out.println(list);
    }
}

