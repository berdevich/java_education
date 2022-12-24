package lr5;

public class Example4 {
    public static void main(String[] args) {
        Task tk1 = new Task(12, 'A');
        Task tk2 = new Task(65.1267);
    }

    static class Task {
        private char a;
        private int b;
        Task(int x, char y) {
            this.a = y;
            this.b = x;
            int len = (int) (Math.log10(b) + 1);
            double res = (double) a + (double) b * 1 / Math.pow(10, len);
            System.out.println("result = " + res + "; ch = " + (double) a + "; int = " + len + "\n");
        }
        Task(double z) {
            char n = (char) z;
            b = (int) ((z - (int) z) * 100);
            System.out.println("ch = " + n + "; int = " + b + "\n");
        }
    }
}
