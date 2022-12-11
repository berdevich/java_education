package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x > 0) {
                System.out.println("Размер массива равен "+ x);
                int[] nums = new int[x];
                int a = 0;
                int b = 0;
                while (a < x) {
                    b++;
                    if (b % 5 == 2) {
                        nums[a] = b;
                        System.out.println("Элемент массива [" + a + "] = " + nums[a]);
                        a++;
                    }
                }
            } else {
                System.out.println("Некорректное значение");
            }
        } else {
            System.out.println("Некорректное значение");
        }
    }
}
