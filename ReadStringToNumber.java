package lesson1;

import java.util.Scanner;

public class ReadStringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.printf("%d : Zero", number);
                break;
            case 1:
                System.out.printf("%d : one", number);
                break;
            case 2:
                System.out.printf("%d : too", number);
                break;
            case 3:
                System.out.printf("%d : three", number);
                break;
            case 4:
                System.out.printf("%d : four", number);
                break;
            case 5:
                System.out.printf("%d : five", number);
                break;
            case 6:
                System.out.printf("%d : six", number);
                break;
            case 7:
                System.out.printf("%d : seven", number);
                break;
            case 8:
                System.out.printf("%d : eight", number);
                break;
            case 9:
                System.out.printf("%d : nine", number);
                break;
            default:
                System.out.println(" Out of Ability");
        }
        if( number >= 10 && number < 20) {
            int number1 = number -10;
            switch (number1) {
                case 1:
                    System.out.printf("%d : ten", number);
                    break;
                case 2:
                    System.out.printf("%d : eleven", number);
                    break;
                case 3:
                    System.out.printf("%d : twelve", number);
                    break;
                case 4:
                    System.out.printf("%d : thirteen", number);
                    break;
                case 5:
                    System.out.printf("%d : fourteen", number);
                    break;
                case 6:
                    System.out.printf("%d : fifteen", number);
                    break;
                case 7:
                    System.out.printf("%d : sixteen", number);
                    break;
                case 8:
                    System.out.printf("%d : seventeen", number);
                    break;
                case 9:
                    System.out.printf("%d : nineteen", number);
                    break;
                default:
                    System.out.println("out of ability");
            }
            if( number >= 20 && number < 100) {
                double down, modulo, numChange;
                numChange = number;
                down = Math.floor(numChange / 10);
                modulo = numChange % 10;
                switch ((int)down) {
                    case 1:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 2:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 3:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 4:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 5:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 6:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 7:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 8:
                        System.out.printf("%d : twenty", number);
                        break;
                    case 9:
                        System.out.printf("%d : twenty", number);
                        break;


                }
            }
        }
    }
}
