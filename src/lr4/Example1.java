package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int a = 23;
        int b;
        for (int i = 1 ; i <= figure; i++) {
            System.out.println("Номер строки: " + i + " ");
            b = 0;
            for (int j = 1; j <=a; j++) {
                System.out.print("+");
                b += 1;
            }
            System.out.println(" Количество символов в строке: " + b);
        }
    }
}