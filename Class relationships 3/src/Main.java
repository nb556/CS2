public class Main {
    public static void main(String[] args) {
        Project manufacture = new Project(556, 2);

        Task[] manufactureTasks = new Task[manufacture.taskAmount];
        manufactureTasks[0] = new Task("Order materials", 2);
        manufactureTasks[1] = new Task("Make products", 3);

        Worker[] materialWorkers = new Worker[manufactureTasks[0].workerAmount];
        materialWorkers[0] = new Worker("John", true);
        materialWorkers[1] = new Worker("Jane", true);

        Worker[] productWorkers = new Worker[manufactureTasks[1].workerAmount];
        productWorkers[0] = new Worker("Jared", true);
        productWorkers[1] = new Worker("Jill", true);
        productWorkers[2] = new Worker("Joshua", false);
    }
}