public class User
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

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString ()
    {
        return lastName + ", " + firstName + " (" + userId + "), " + address;
    }
}