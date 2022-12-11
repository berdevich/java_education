package lr3;

import java.util.Scanner;

public class Example3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = sc.nextInt();
        long a = 0;
        long b = 1;
        long c = 1;
        for (int i = x; i > 0; i--) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}