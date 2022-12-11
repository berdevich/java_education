package lr3;

import java.util.Scanner;

public class Example5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме:");
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 0; x > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum = sum + i;
                x--;
            }
        }
        System.out.println(sum);
    }
}