package lr4;

import java.util.Random;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива:");
        int a = sc.nextInt();
        System.out.println("Введите количество строк массива:");
        int b = sc.nextInt();
        int mas[][] = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                mas[i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j = " + j + "; value= " + mas[i][j]);
            }
        }
        //System.out.println("===================================");

        int x = random.nextInt(b-1);
        int y = random.nextInt(a-1);

        System.out.println("Номер строки для удаления: " + (x) + ", номер столбца для удаления: " + (y));
        //System.out.println("===================================");

        int mas2[][] = new int[b-1][a-1];
        for (int i = 0, o = 0; i < b-1; o++) {
            if (o != x){
                for (int j =0, k = 0; j < a-1; k++) {
                    if (k != y) {
                        mas2[i][j] = mas[o][k];
                        System.out.println("i = " + i + "; j= " + j + "; value= " + mas2[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}