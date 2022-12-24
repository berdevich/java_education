package lr5;

public class Example2 {
    public static void main(String[] args) {
        Task Ex = new Task();
        Ex.Set('A', 'Z');
        Ex.Char();
    }
    static class Task {
        private char n;
        private char n2;
        public void Set(char n3, char n4) {
            this.n = n3;
            this.n2 = n4;
        }
        public void Char() {
            int x = n;
            int y = n2;
            if (n > n2) {
                x = n2;
                y = n;
            }
            int z = 1;
            for (int i = x; i <= y; i++) {
                System.out.println(z + " символ = " + (char) i);
                z++;
            }
        }
    }
}