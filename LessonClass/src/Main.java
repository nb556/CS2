public class Main
{
    public static void main(String[] args)
    {
        User[] users = new User[2];
        users [0] = new User("Doe", "Jane", "MIA");
        users [1] = new User("Dough", "John", "Downing Street");

        for (User i : users)
            System.out.println(i);
    }
}