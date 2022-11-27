package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        System.out.println("Ваши числа:" + (num - 1) + " " + num + " " + (num + 1) + " " + (((num - 1) + num + (num + 1)) * ((num - 1) + num + (num + 1))));
        sc.close();
    }
}
