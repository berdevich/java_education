package lr3;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int Size = 10;
        char a[] = new char[Size];
        char b = 's';
        for (int i = 0; i < Size; b--) {
            if (b % 2 == 1) {
                a[i] = b;
                System.out.println("Элемент массива [" + i + "] = " + a[i]);
                i++;
            }
        }
        Arrays.sort(a); // Сортировка массива по возрастанию его элементов
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Элемент массива [" + i + "] после сортировки = " + a[i]);
        }
    }
}
