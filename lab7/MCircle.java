package week5;

public class MCircle {
    public static void main(String[] args) {
        Circle[]circle;
        circle = new Circle[10];

        circle[1] = new Circle();
        circle[1].setR1(2);
        circle[1].getArea();
        circle[1].getCircle();

        circle[2] = new Circle();
        circle[2].setR2(3);
        circle[2].getArea2();
        circle[2].getCircle2();

        circle[3] = new Circle();
        circle[3].setR3(1);
        circle[3].getArea3();
        circle[3].getCircle3();

        circle[4] = new Circle();
        circle[4].setR4(-1);
        circle[4].getArea4();
        circle[4].getCircle4();

        for(int i =1;i<=4;i++){
            System.out.println("Area of cir"+i+" = "+circle[i].getArea());
            System.out.println("Circumferrene of cir"+i+" = "+circle[i].getCircle());
        }
        Circle fs1_2Circle = new Circle();
        fs1_2Circle.Fs1_2(2, 3);
        Circle fs1_3Circle = new Circle();
        fs1_3Circle.Fs1_3(2, 1);
    }
}
