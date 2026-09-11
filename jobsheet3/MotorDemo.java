package jobsheet3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kontakOn = 50;
        motor.printStatus();
    }
}
