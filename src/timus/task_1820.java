package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a,b;
        int time=0;
        a=in.nextInt();
        b=in.nextInt();
        in.close();
        if (a%b==0){
            time = (a/b)*2;
        }
        else if (a<=b){
            time = 2;
        }
        else if(a%b <= b/2 && a%b >0){
            time = ((a/b)+1)*2-1; }
        else if(a%b > b/2){
            time = ((a/b)+1)*2;
        }

        System.out.print(time);

        out.flush();
    }
}
