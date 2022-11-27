package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа, чтобы узнать их сумму");
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();
        System.out.println("Сумма чисел равна: " + (num1 + num2));
        sc.close();
    }
}
