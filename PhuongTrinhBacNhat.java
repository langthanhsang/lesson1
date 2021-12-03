package lesson1;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("linear Equation Reolver");
        System.out.println("Given a quation as ' a * x  + b = c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if( a != 0) {
            double answer = (c - b) /a;
            System.out.printf("Equation pass width x = % f!\n",answer);
        } else {
            if( b == c) {
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("No solution!");

            }
        }
    }
}
