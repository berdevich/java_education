package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class task_1293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = (N * (A * B)) * 2;
        out.println(result);
        out.flush();
    }
}
