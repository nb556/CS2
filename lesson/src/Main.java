public class Main
{
    public static void main(String[] args)
    {
        Reservation[] reservations = new Reservation[3];
        reservations [0] = new Reservation("John", 15);
        reservations [0] = new Reservation("Jane", 12);
        reservations [0] = new Reservation("Wendy", 15);

        String key = "Mary";
        for (Reservation i : reservations)
        {
            if (i.name.equals (key))
                {
                System.out.println(i.room);
                break;
            }
        }
    }
}

class Reservation
{
    Reservation (String name, int room)
    {
        this.name = name;
        this.room = room;
    }

    String name;
    int room;
}