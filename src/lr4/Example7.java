package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива:");
        int a = sc.nextInt();
        System.out.println("Введите количество строк массива:");
        int b = sc.nextInt();
        int[][] mas = new int[b][a];
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; z < mas.length; z++) {
            for (int j = 0; j < (mas[i].length - x); j++) {
                mas[i][j] = y;
                y++;
            }
            if (i < mas.length - 1) {
                i++;
            }
            for (int o = b - 1; o > x; o--) {
                mas[o][mas[i].length - 1 - x] = y;
                y++;
            }
            x++;
        }
        int h = 0;
        for (int i = 0; i < mas.length; i++) {
            int n = i + 1;
            System.out.print("Строка № " + n + ": ");
            for (int j = 0; j < mas[i].length; j++){
                System.out.print(mas[i][j] + " ");
                h++;
            }
            System.out.println(" В этой строке " + h + " цифр");
            h = 0;
        }
    }
}