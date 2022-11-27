package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String month = sc.nextLine();
        System.out.println("Введите количество дней в этом месяце: ");
        int date = sc.nextInt();
        System.out.println(month + " содержит " + date + " " + "дней");
        sc.close();
    }
}
