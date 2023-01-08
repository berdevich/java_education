package lr6;

public class Example5 {

    public static void main(String[] args) {
        int n = 15;
        int square1 = (n*(n+1)*(2*n+1)/6);
        boolean test;
        System.out.println("Рекурсивный метод:");
        int square2 = squareSum1.SquareSum1(n);
        test = square2 == square1;
        System.out.println("Сумма квадратов числа "+"\""+n+"\""+" = "+square2+" ("+test+")");
        System.out.println("Метод без рекурсии:");
        int square3 = squareSum1.SquareSum2(n);
        test = square3 == square1;
        System.out.println("Сумма квадратов числа "+"\""+n+"\""+" = "+square3+" ("+test+")");
    }
    private static class squareSum1 {
        private static int SquareSum1(int a) {
            int result = 0;
            System.out.println("*" + a);
            if (a <= 1) return 1;
            result += SquareSum1(a-1) + a * a;
            return result;
        }

        private static int SquareSum2(int b) {
            int result = 0;
            int x = b;
            int y = 2;
            for(int i = b; i > 0; i--) {
                System.out.println("*" + x);
                result = (int)Math.pow(x,y) + result;
                x--;
            }
            return result;
        }
    }
}
