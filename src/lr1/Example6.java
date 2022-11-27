package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input lastname :");
        String lname = sc.nextLine();
        System.out.println("Input name: ");
        String name = sc.nextLine();
        System.out.println("Input patronymic: ");
        String pname = sc.nextLine();
        System.out.println("Hello " + lname + " " + name + " " + pname);
        sc.close();
    }
}
