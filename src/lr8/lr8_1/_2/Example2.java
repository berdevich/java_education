package lr8.lr8_1._2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    //метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1) { //признак отсутсвия конца файла
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            //с потоком связан файл
            InputStream inFile = new FileInputStream("src\\lr8\\lr8_1\\_2\\text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            //с потоком связана интернет-страница
            InputStream inUrl = new URL("https://www.google.ru/").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            //с потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
