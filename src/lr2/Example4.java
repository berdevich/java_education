package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 4 && n < 11) {
            System.out.println("Число удовлетворяет критериям!");
        } else {
            System.out.println("Число не удовлетворяет критериям!");
        }
    }
}