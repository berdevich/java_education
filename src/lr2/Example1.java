package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 3 == 0) {
            System.out.println("Число делится на 3!");
        } else {
            System.out.println("Число не делится на 3!");
        }
    }
}
