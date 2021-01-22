package week8;

import java.util.Scanner;

public class MainBicycle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(0);

        loop: while (true) {
            switch (read_input()) {
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
            }
        }

    }

    static String read_input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
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
            System.out.println("Bike speed cannot exceed 99km/h");
        } else speed += GEAR_RATIO;
    }

    public void bread() {
        speed -= GEAR_RATIO;
    }

    public void print_now_speed() {
        System.out.printf("now bicycle speed is: %skm/h\n", this.now_speed());
    }

}
