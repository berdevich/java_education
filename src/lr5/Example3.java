package lr5;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число (a):");
        int a = sc.nextInt();
        System.out.println("Введите второе число (b):");
        int b = sc.nextInt();
        Task tk1 = new Task();
        Task tk2 = new Task(a);
        Task tk3 = new Task(a,b);
    }
    static class Task {
        private int x;
        private int y;
        Task(){
            System.out.println("Koнcтpyиpoвaниe объекта без передачи аргументов:\n");
        }
        Task(int num1){
            System.out.println("Koнcтpyиpoвaниe объекта с передачей одного аргумента:");
            this.x = num1;
            System.out.println("a^a = " + ex (num1)+"\n");
        }
        public int ex (int num2) {
            this.x = num2;
            int res = 1;
            for (int i = 1; i <= num2; i++) {
                res = num2 * res;
            }
            return res;
        }
        Task(int num3, int num4){
            System.out.println("Koнcтpyиpoвaниe объекта с передачей двух аргументов:");
            this.x = num3;
            this.y = num4;
            System.out.println("a^b = " + ex2 (num3, num4) + "\n");
        }
        public int ex2 (int num5, int num6){
            num5 = x;
            num6 = y;
            int result2 = 1;
            for (int i=1; i <= y; i++) {
                result2 = x * result2;
            }
            return result2;
        }
    }
}
