package lesson1;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.println("nhập số tiền USD");
        Scanner scanner = new Scanner(System.in);
        int Vnd, usd;
        usd = scanner.nextInt();
        Vnd = usd * 23000;
        System.out.println(Vnd);
    }
}
