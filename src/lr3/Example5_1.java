package lr3;

import java.util.Scanner;

import java.util.Random;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме:");
        int x = sc.nextInt();
        int sum = 0;
        Random number = new Random();
        int i = x;
        while (i > 0) {
            int nums = number.nextInt();
            if (nums % 5 == 2 || nums % 3 == 1) {
                System.out.println(nums);
                sum = sum + nums;
                i--;
            }
        }
        System.out.println(sum);
    }
}
