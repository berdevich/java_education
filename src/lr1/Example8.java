package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String week = sc.nextLine();
        System.out.println("Введите название месяца: ");
        String month = sc.nextLine();
        System.out.println("Введите дату: ");
        int date = sc.nextInt();
        System.out.println("Сегодня " + week + "," + " " + date + " число месяца " + month);
        sc.close();
    }
}
