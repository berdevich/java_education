package lr6;

public class Example9 {
    public static void main(String[] args) {
        char[] Alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж','з', 'и', 'й', 'к',
                'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        Task.CharArray(Alphabet);
        Task.RevCharArray();

    }

    private static class Task {
        private static char[] Array;
        private static char[] CharArray(char ChAr[]) {
            char changeCh;
            int a = ChAr.length-1;
            Array = new char[ChAr.length];
            for (int i = 0; i < ChAr.length; i++) {
                changeCh = ChAr[i];
                Array[i] = ChAr[a-i];
                Array[a-i] = changeCh;
            }
            return Array;
        }

        private static void RevCharArray() {
            for (int i = 0; i < Array.length; i++) {
                System.out.println("Элемент массива № " + i + " = " + Array[i]);
            }
        }
    }
}
