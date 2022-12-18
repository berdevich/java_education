package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = sc.nextLine();
        System.out.println("Введите ключ:");
        int key = sc.nextInt();
        String encrypt = cipher.encrypt(text, key);
        System.out.println("Текст после преобразования:" + "\"" + encrypt + "\"");
        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean answer = false;
        while (!answer) {
            String reply = sc.next();
            if (reply.toLowerCase().equals("y")) {
                String decrypt = cipher.decrypt(encrypt, key);
                System.out.println(decrypt);
                answer = true;
            } else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                answer = true;
            } else {
                System.out.println("Введите корректный ответ:");
                answer = false;
            }
        }
    }
    private static class cipher {
        static String encryption;
        private static String encrypt(String encr, int key) {
            char[] mas = encr.toCharArray();
            int[] mas2 = new int[mas.length];
            for (int i = 0; i < mas.length; i++) {
                mas2[i] = mas[i];
                mas2[i] = mas2[i] + key;
            }
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (char) mas2[i];
            }
            encryption = new String(mas);
            return encryption;
        }
        private static String decrypt(String encr, int key) {
            char[] array = encr.toCharArray();
            int[] array2 = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
                array2[i] = array2[i] - key;
            }
            for (int i = 0; i < array.length; i++) {
                array[i] = (char) array2[i];
            }
            encryption = new String(array);
            return encryption;
        }
    }
}