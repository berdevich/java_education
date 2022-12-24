package lr5;

public class Example5 {
    public static void main(String[] args) {
        Task ex = new Task(10);
        System.out.println("Число = " + ex.Print());
        ex.Set1(20);
        System.out.println("Число = " + ex.Print());
        ex.Set1(-30);
        System.out.println("Число = " + ex.Print());
        ex.Set1(100);
        System.out.println("Число = " + ex.Print());
        ex.Set2();
        System.out.println("Число = " + ex.Print());
    }
    static class Task {
        private int a;
        public void Set1(int b) {
            System.out.println("Метод Set() c аргументом");
            a = b;
            if (b >= 100) {
                a = 100;
            }
            if (b <= 0) {
                a = 0;
            }
        }
        public void Set2() {
            System.out.println("Метод Set() без аргумента");
            a = 0;
        }
        public int Print() {
            return a;
        }
        Task(int c) {
            System.out.println("Example() конструктор");
            this.Set1(c);
        }
    }
}
