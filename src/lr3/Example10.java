package lr3;

import java.util.Random;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int Size = sc.nextInt();
        System.out.println("Размер массива равен "+ Size);
        int[] nums = new int[Size];
        Random x = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = x.nextInt();
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }
        for (int i = nums.length; i >= 0; i--) {
            for (int o = 0; o < i; o++) {
                if (nums[o] < nums[o + 1]) {
                    int p = nums[o];
                    nums[o] = nums[o + 1];
                    nums[o + 1] = p;
                }
            }
        }
        for (int i = 0; i < nums.length; i++){
            System.out.println("Элемент массива [" + i + "] после сортировки = " + nums[i]);
        }
    }
}