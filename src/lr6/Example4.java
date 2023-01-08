package lr6;

public class Example4 {
    public static void main(String[] args) {
        DoubleFactorial a = new DoubleFactorial();
        int number = 10;
        System.out.println("Рекурсивный метод:");
        int fact = a.factor(number);
        System.out.println("Двойной факториал числа: "+number+"!! = "+fact);
        System.out.println("Метод без рекурсии:");
        int fact2 = a.factor1(number);
        System.out.println("Двойной факториал числа "+number+"!! = "+fact2);
    }
    private static class DoubleFactorial {
        private int factor(int b) {
            int result;
            System.out.println("*" + b);
            if (b == 1) return 1;
            if (b == 2) return 2;
            result = factor(b - 2) * b;
            return result;
        }

        private int factor1(int c) {
            int result = c;
            int d = c;
            for(int i = c; i > 2; i = i - 2) {
                System.out.println("*" + d);
                d = d - 2;
                result *= d;
            }
            return result;
        }
    }
}