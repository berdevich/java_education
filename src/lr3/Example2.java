package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = sc.nextLine();

            if (day.equals("Понедельник")) {
            } else if (day.equals("Вторник")) {
            } else if (day.equals("Среда")) {
            } else if (day.equals("Четверг")) {
            } else if (day.equals("Пятница")) {
            } else if (day.equals("Суббота")) {
            } else if (day.equals("Воскресенье")) {
            } else {
                System.out.println("Некорректное значение!");
            }

            switch (day) {
                case "Понедельник":
                    System.out.println(day + " это 1-ый день недели");
                    break;
                case "Вторник":
                    System.out.println(day + " это 2-ой день недели");
                    break;
                case "Среда":
                    System.out.println(day + " это 3-ий день недели");
                    break;
                case "Четверг":
                    System.out.println(day + " это 4-ый день недели");
                    break;
                case "Пятница":
                    System.out.println(day + " это 5-ый день недели");
                    break;
                case "Суббота":
                    System.out.println(day + " это 6-ой день недели");
                    break;
                case "Воскресенье":
                    System.out.println(day + " это 7-ой день недели");
                    break;
                default:
                    System.out.println("Некорректное значение!");
                    break;
            }
        }

    }
