package timus;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        byte Harry, Larry, Sum;

        Harry=in.nextByte();
        Larry = in.nextByte();
        in.close();
        Sum = (byte) (Harry+Larry-1);
        Harry = (byte) (Sum-Harry);
        Larry = (byte) (Sum-Larry);
        System.out.print(Harry+" "+Larry);
        out.flush();
    }
}
