package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 9 && n % 4 == 0) {
            System.out.println("Число удовлетворяет критериям!");
        } else {
            System.out.println("Число не удовлетворяет критериям!");
        }
    }
}