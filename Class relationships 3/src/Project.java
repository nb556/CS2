public class Project
{
    String name;
    int taskAmount;
    public Project(String name, int taskAmount)
    {
        this.name = name;
        this.taskAmount = taskAmount;
    }
}

class Task
{
    String name;
    int workerAmount;
    Task(String name, int workerAmount)
    {
        this.name = name;
        this.workerAmount = workerAmount;
    }

    public int getWorkerAmount() {
        return workerAmount;
    }
}

class Worker
{
    String name;
    boolean isEmployee;

    Worker(String name, boolean isEmployee)
    {
        this.name = name;
        this.isEmployee = isEmployee;
    }
}