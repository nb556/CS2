public class Project {
    int id;
    int taskAmount;
    public Project(int id, int taskAmount) {
        this.id = id;
        this.taskAmount = taskAmount;
    }
}
class Task {
    String name;
    int workerAmount;
    Task(String name, int workerAmount) {
        this.name = name;
        this.workerAmount = workerAmount;
    }
}
class Worker {
    String name;
    boolean isEmployee;
    Worker(String name, boolean isEmployee) {
        this.name = name;
        this.isEmployee = isEmployee;
    }
}