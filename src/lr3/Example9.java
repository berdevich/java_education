package lr3;

import java.util.Scanner;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int Size = sc.nextInt();
        System.out.println("Размер массива равен " + Size);
        int[] nums = new int[Size];
        Random x = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = x.nextInt();
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        int[] a = new int[Size];
        int[] b = new int[Size];
        int c = nums[0];
        for (int i = 0; i < 2; i++) {
            for (int o = 0; o < nums.length; o++) {
                if (c >= nums[o]) {
                    a[o] = o;
                    c = nums[o];
                    b[o] = nums[o];
                } else {
                    a[o] = 0;
                    b[o] = 0;
                }
            }
        }
        for (int p = 0; p < nums.length; p++) {
            if (b[p] == c && a[p] != 0) {
                System.out.println("Элемент массива [" + a[p] + "]" + b[p] + "- минимальное значение");
            }
        }
    }
}