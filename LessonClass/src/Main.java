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

class User
{
    static int nextId = 0;
    String lastName;
    String firstName;
    int userId;
    String address;

    public User(String lastName, String firstName, String address)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.userId = nextId;
        nextId++;
        this.address = address;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getUserId() {
        return userId;
    }

    public String getAddress() {
        return address;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString ()
    {
        return lastName + ", " + firstName + " (" + userId + "), " + address;
    }
}