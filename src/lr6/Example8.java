package lr6;

import java.util.Random;

public class Example8 {
    public static void main(String[] args) {
        Random rndm = new Random(100);
        int ArrayLength = 10;
        int Array[] = new int[ArrayLength];
        for (int i = 0 ; i < ArrayLength; i++) {
            Array[i] = rndm.nextInt(100);
            System.out.println("Элемент массива № "+i+" = "+Array[i]);
        }

        System.out.println("Среднее значение для элементов массива: "+Task.ArrayMedium(Array));
    }
    protected static class Task{
        private static double ArrayMedium (int Array[]){
            int sum = 0;
            for (int i = 0 ; i < Array.length; i++){
                sum += Array[i];
            }
            double result = (double)sum/Array.length;
            return result;
        }
    }
}
