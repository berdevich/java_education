package lr3;

import java.util.Scanner;

public class Example4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите первое целое число:");
        int x = sc.nextInt();
        System.out.println("Ввведите второе целое число:");
        int y = sc.nextInt();

        if (x > y) {
            while (y <= x) {
                System.out.println(y);
                y++;
            }
        } else {
            while (x <= y) {
                System.out.println(x);
                x++;
            }
        }
    }
}