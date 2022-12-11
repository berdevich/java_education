package lr3;

import java.util.Scanner;

public class Example3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи:");
        int x = sc.nextInt();
        int i = x;
        long a = 0;
        long b = 1;
        long c = 1;
        while (i > 0) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
            i--;
        }
    }
}
