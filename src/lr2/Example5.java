package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Введите Ваше число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 999 && n < 2000) {
            System.out.println("В числе одна тысяча");
        } else if (n > 1999 && n < 3000) {
            System.out.println("В числе две тысячи");
        } else if (n > 2999 && n < 4000) {
            System.out.println("В числе три тысячи");
        } else if (n > 3999 && n < 5000) {
            System.out.println("В числе четыре тысячи");
        } else if (n > 4999 && n < 6000) {
            System.out.println("В числе пять тысяч");
        } else if (n > 5999 && n < 7000) {
            System.out.println("В числе шесть тысяч");
        } else if (n > 6999 && n < 8000) {
            System.out.println("В числе семь тысяч");
        } else if (n > 7999 && n < 9000) {
            System.out.println("В числе восемь тысяч");
        } else if (n > 8999 && n < 10000) {
            System.out.println("В числе девять тысяч");
        } else if (n == 10000) {
            System.out.println("В числе десять тысяч");
        } else if (n > 10000) {
            System.out.println("В числе больше десяти тысяч!");
        } else if (n < 1000) {
            System.out.println("В числе нет тысяч!");
        }
    }
}