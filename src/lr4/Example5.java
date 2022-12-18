package lr4;

import java.util.Random;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива:");
        int a = sc.nextInt();
        System.out.println("Введите количество строк массива:");
        int b = sc.nextInt();
        int[][] mas = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mas[i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j = " + j + "; value = " + mas[i][j]);
            }
        }

        System.out.println("Строки и столбцы меняются местами:");

        int[][] mas2 = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                mas2[i][j] = mas[j][i];
                System.out.println(" i = " + i + "; j = " + j + "; value = " + mas2[i][j]);
            }
        }
    }
}