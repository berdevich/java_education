package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника:");
        int height = sc.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int width = sc.nextInt();
        int [][] mas = new int [height][width];
        int a = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mas[i][j] = 2;
            }
        }
        for (int k = 0; k < height; k++) {
            int b = k + 1;
            if (b < 10)
            System.out.print("Строка № " + b + " : ");
            else if (b > 9)
                System.out.print("Строка № " + b + ": ");
            for (int l = 0; l < width; l++){
                System.out.print(mas[k][l]+ " ");
                a++;
            }
            System.out.println(" В этой строке " + a + " цифр");
            a = 0;
        }
    }
}
