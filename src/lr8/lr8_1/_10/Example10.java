package lr8.lr8_1._10;

import java.io.*;

public class Example10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\lr8\\lr8_1\\_10\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter("src\\lr8\\lr8_1\\_10\\MyFile2.txt", "cp1251");
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
                System.out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!" + e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}