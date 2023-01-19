package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        byte a;
        String Answer = "YES";
        a = in.nextByte();
        in.close();
        int calc = 12-a;
        if (calc>5) {
            Answer="NO";
        }

        System.out.print(Answer);
        out.flush();
    }
}
