package lr8.lr8_3;

import java.io.*;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\lr8\\lr8_3\\MyFile1.txt")));
            out = new PrintWriter("src\\lr8\\lr8_3\\MyFile2.txt");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                String[] arr = s.split(" ");
                int rowCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].matches("(?ui:[^аеёиоуыэюя]).*")) {
                        out.print(arr[i] + " ");
                        rowCount++;
                    }
                }
                out.println("\nНомер строки: " + lineCount + "\nКоличество выбранных слов: " + rowCount + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}