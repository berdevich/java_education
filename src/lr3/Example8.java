package lr3;

public class Example8 {
    public static void main(String[] args) {
        int Size = 10;
        char a[] = new char[Size];
        char b = 'A';
        char c [] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int x = 0; x < a.length; b++) {
            for (int y = 0; y < c.length; y++) {
                if (b == c[y]) {
                    b++;
                }
            }
            a[x] = b;
            System.out.println("Элемент массива [" + x + "] = " + a[x]);
            x++;
        }
    }
}