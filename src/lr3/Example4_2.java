package lr3;

import java.util.Scanner;

public class Example4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите первое целое число:");
        int x = sc.nextInt();
        System.out.println("Ввведите второе целое число:");
        int y = sc.nextInt();

        if (x > y) {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }
}