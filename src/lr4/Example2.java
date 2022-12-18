package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 15;
        int a = 0;
        for (int i = 1; i <= figure; i++) {
            System.out.println("Номер строки: " + i + " ");
            for (int j = 0; j <= a; j++) {
                System.out.print("+");
            }
            a += 1;
            System.out.println(" Количество символов в строке: " + a);
        }
    }
}