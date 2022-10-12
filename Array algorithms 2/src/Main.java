public class Main
{
    public static void main(String[] args)
    {
        Students[] student = new Students[4];
        student[0] = new Students("Alissa", "B");
        student[1] = new Students("Ben", "D");
        student[2] = new Students("Charlie", "B");
        student[3] = new Students("Dianna", "A");
    }
}



class Students
{
    Students (String name, String grade)
    {
        this.name = name;
        this.grade = grade;
    }
    String name; String grade;
}