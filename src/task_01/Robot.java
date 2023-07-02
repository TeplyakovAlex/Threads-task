package task_01;

public class Robot extends Thread {

    Robot(String str) {
        super(str);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()/* отримати ім'я потоку **/ + " Started");
        try {
            Robot.sleep(1500);/* потік засинає на 1,5 секунди **/
            System.out.println(Thread.currentThread().getName()/* отримати ім'я потоку **/ + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread().getName()/* отримати ім'я потоку **/ + " Stopped");
    }
}
