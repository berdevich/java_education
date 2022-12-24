package lr5;

public class Example6 {
    public static void main(String[] args) {
        Task tk1 = new Task(1, 3);
        tk1.Print();
        Task tk2 = new Task(1);
        tk2.Print();
        tk1.Set1(2, 10);
        tk1.Print();
        tk1.Set2(-10);
        tk1.Print();
    }
    static class Task {
        private static int min;
        private static int max;
        static void Set1(int a, int b) {
            System.out.println("Метод SetInt() c 2-я аргументами");
            min = Math.min(Math.min(a, min), b);
            max = Math.max(Math.max(a, max), b);
        }
        static void Set2(int c) {
            System.out.println("Метод SetInt() c 1-м аргументом");
            min = Math.min(min, c);
            max = Math.max(max, c);
        }
        static void Print() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }
        Task(int x, int y) {
            System.out.println("Конструктор Example_6() c 2-я аргументами");
            min = Math.min(x,y);
            max = Math.max(x,y);
        }
        Task(int z) {
            System.out.println("Конструктор Example_6() c 1-м аргументом");
            min = Math.min(min, z);
            max = Math.max(max, z);
        }
    }
}