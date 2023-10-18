package Oops.Interface;

// which particular method Run it determent at Run time

public class Main {
    public static void main(String[] args) {
        Car car=new Car();

        car.acc();
        car.brake();

        car.start();
        car.stop();
    }
}
