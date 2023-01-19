package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_1787{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a,b,sum;
        sum = 0;
        a=in.nextInt();
        b=in.nextInt();
        int [] CarArray = new int [b];
        for (int i=0; i<b;i++){
            CarArray[i]=in.nextInt();
            sum += CarArray[i]-a;
            if (sum<0){
                sum=0;}
        }
        in.close();

        System.out.print(sum);

        out.flush();
    }
}
