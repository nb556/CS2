public class Main
{
    public static void main(String[] args)
    {
        Project[] projects = new Project[1];
        projects[0] = new Project("556", 2);

        Task[] tasks = new Task[projects[0].taskAmount];
        tasks[0] = new Task("Order materials", 2);
        tasks[1] = new Task("Make products", 3);

        Worker[] materialWorkers = new Worker[tasks[0].workerAmount];
        materialWorkers[0] = new Worker("John", true);
        materialWorkers[1] = new Worker("Jane", true);

        Worker[] productWorkers = new Worker[tasks[1].workerAmount];
        productWorkers[0] = new Worker("Jared", true);
        productWorkers[1] = new Worker("Jill", true);
        productWorkers[2] = new Worker("Joshua", false);
    }
}