package ec.edu.utpl.carreras.computacion.s7;

import ec.edu.utpl.carreras.computacion.s7.tasks.TaskSummarize;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        var task = new TaskSummarize("/Users/jorgaf/Documents/Clases/abril-agosto-2025/presencial/pro-ava/weatherHistory_1.csv");
        var thread = new Thread(task);

        thread.start();
        System.out.println(task.getResult());

    }
}
