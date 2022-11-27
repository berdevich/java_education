package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Введите год своего рождения: ");
        int date = sc.nextInt();
        System.out.println("Вас зовут " + name + ", " + "вам " + (2022 - date) + " " + "лет");
        sc.close();
    }
}
