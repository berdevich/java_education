package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a;
        a = in.nextInt();
        char[] lit = new char[a];
        int[] num = new int[a];
        int[] sum = new int[a];
        for (int i = 0; i < a; i++) {
            String temp = in.next();
            char[] tempChar = temp.toCharArray();
            char c = tempChar[0];
            lit[i] = c;
            num[i] = tempChar[1]-'0';
            if (c > 98 && c < 103) {
                sum[i] = 8;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 2;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 4;
                }
            } else if (c == 98 || c == 103) {
                sum[i] = 6;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 2;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 3;
                }
            } else {
                sum[i] = 4;
                if (num[i] == 2 || num[i] == 7) {
                    sum[i] -= 1;
                } else if (num[i] == 1 || num[i] == 8) {
                    sum[i] -= 2;
                }
            }


        }
        in.close();
        for(int i = 0; i < a; i++){
            System.out.println(sum[i]);}
        out.flush();
    }
}