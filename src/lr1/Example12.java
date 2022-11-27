package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = sc.nextInt();
        System.out.println("Ваш год рождения: " + (2022 - age));
        sc.close();
    }
}
