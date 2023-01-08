package lr6;

public class Example7 {
    public static void main(String[] args) {
        char[] Alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж','з', 'и', 'й', 'к',
                           'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                           'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Task.CharArray(Alphabet);
        Task.Array2();
}
    private static class Task {
        static int[] Array;
        private static int[] CharArray(char ChAr[]) {
            Array = new int[ChAr.length];
            for (int i = 0; i < ChAr.length; i++) {
                Array[i] = (int)ChAr[i];
            }
            return Array;
        }

        private static void Array2() {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("Array[" + i + "] = " + Array[i]);
            }
        }
    }
}
