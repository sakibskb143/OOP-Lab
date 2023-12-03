import java.util.Scanner;

public class Calculator {

    int x, y;

    Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void add() {

        System.out.println("Addition : " + (x + y));

    }

    void subtra() {

        System.out.println("Subtraction : " + (x - y));

    }

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter the value of first object : ");

    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     System.out.println("Enter the value of first object : ");

    //     int c = in.nextInt();
    //     int d = in.nextInt();
    //     Calculator calc = new Calculator(a, b);
    //     Calculator calc1 = new Calculator(c, d);
    //     System.out.println(" Output of First object :");
    //     calc.add();
    //     calc.subtra();
    //     System.out.println(" Output of Second object :");
    //     calc1.add();
    //     calc1.subtra();

    // }

}