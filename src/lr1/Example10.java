package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год своего рождения: ");
        int date = sc.nextInt();
        System.out.println("Вам " + (2022 - date) + " " + "лет");
        sc.close();
    }
}
