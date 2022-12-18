package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту треугольника:");
        int height = sc.nextInt();
        int [][] mas = new int [height][];
        for (int i = 0; i < mas.length; i++) {
            int a = i + 1;
            mas[i]=new int[a];
        }
        int b = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                mas[i][j] = 0;
            }
        }
        for (int i = 0; i < height; i++) {
            int c = i + 1;
            if (c < 10)
            System.out.print("Строка № " + c + " : ");
            else if (c > 9)
            System.out.print("Строка № " + c + ": ");
            for (int j = 0; j < mas[i].length; j++){
                System.out.print(mas[i][j] + " ");
                b++;
            }
            System.out.println(" В этой строке " + b + " цифр");
            b = 0;
        }
    }
}