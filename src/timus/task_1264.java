package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        in.close();
        int time = a*(b+1);

        System.out.print(time);
        out.flush();
    }
}
