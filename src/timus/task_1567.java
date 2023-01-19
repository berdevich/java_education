package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1567 {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line = consoleReader.readLine();
        consoleReader.close();
        int a = 0;

        for (int i = 0; i < line.length(); i++)
            switch (line.charAt(i)) {
                case 'a':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 's':
                case 'v':
                case 'y':
                case '.':
                case ' ':
                    a += 1;
                    break;
                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 't':
                case 'w':
                case 'z':
                case ',':
                    a += 2;
                    break;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'u':
                case 'x':
                case '!':
                    a += 3;
                    break;
                default:
                    break;
            }

        System.out.println(a);
    }
}