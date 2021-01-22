package week8;

import java.util.Scanner;

public class Main2Bicycle {

    public static void main(String[] args) {
        MountainBike bicycle = new MountainBike(0);

        loop: while (true) {
            switch (read_input()) {
                case "gear":
                    System.out.println("Please enter the gear you want to use: %n");
                    int gear = 1;
                    try {
                        gear = Integer.parseInt(read_input());
                    } catch (Exception e) {
                        System.out.println("Please enter the number!%n");
                        break;
                    }
                    bicycle.set_gear(gear);
                    System.out.printf("The gear has been set to %s%n", gear);
                    break;
                case "speed":
                    bicycle.print_now_speed();
                    break;
                case "up":
                    bicycle.speed_up();
                    bicycle.print_now_speed();
                    break;
                case "break":
                    bicycle.bread();
                    bicycle.print_now_speed();
                    break;
                case "quit":
                    break loop;
                default:
                    System.out.println("Unknown command!%n");
                    break;
            }
        }

    }

    static String read_input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

class MountainBike extends Bicycle {

    int gear = 1;

    MountainBike(int speed) {
        super(speed);
    }

    public void set_gear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speed_up() {
        int new_speed = speed + gear * GEAR_RATIO;
        if (new_speed > 99) {
            System.out.println("Error: Bike speed cannot exceed 99km/h!!%n");
        } else speed = new_speed;
    }
}

class Bicycle {
    protected int speed;

    protected static int GEAR_RATIO = 5;

    Bicycle(int speed) {
        this.speed = speed;
    }

    public int now_speed() {
        return this.speed;
    }

    public void speed_up() {
        if (speed + GEAR_RATIO > 99) {
            System.out.println("Error: Bike speed cannot exceed 99km/h!!%n");
        } else speed += GEAR_RATIO;
    }

    public void bread() {
        speed -= GEAR_RATIO;
    }

    public void print_now_speed() {
        System.out.printf("now bicycle speed is: %skm/h%n", this.now_speed());
    }

}