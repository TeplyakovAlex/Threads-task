package task_01;

public class Main {

    static String name;

    public static void main(String[] args) {

        name = "Robot 1.0";
        getRobotInfo(getRobot(name));

        name = "Robot 2.0";
        getRobotInfo(getRobot(name));
    }

    private static  /* ??? **/Robot getRobot(String name) {
       return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot.getName()/* отримати ім'я потоку **/ + " state: " + robot.getState()/* отримати стан потоку **/);
        robot.start();/* поток стартует **/
        System.out.println(robot.getName()/* отримати ім'я потоку **/ + " state: " + robot.getState());/* отримати стан потоку **/
    }
}
