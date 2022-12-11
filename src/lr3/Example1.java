package lr3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для определения дня недели:");
        int day = sc.nextInt();
        switch(day) {
            case 1:
                System.out.println(day + " день недели - понедельник");
                break;
            case 2:
                System.out.println(day + " день недели - вторник");
                break;
            case 3:
                System.out.println(day + " день недели - среда");
                break;
            case 4:
                System.out.println(day + " день недели - четверг");
                break;
            case 5:
                System.out.println(day + " день недели - пятница");
                break;
            case 6:
                System.out.println(day + " день недели - суббота");
                break;
            case 7:
                System.out.println(day + " день недели - воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
    }
}
