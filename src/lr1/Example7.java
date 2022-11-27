package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input age: ");
        int age = sc.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        sc.close();
    }
}
