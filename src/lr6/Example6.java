package lr6;

public class Example6 {
    public static void main(String[] args) {
        int[] inArray = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
        System.out.println("Второй аргумент метода меньше длины массива");
        Task tsk = new Task();
        for (int i = 0; i < tsk.Array(inArray, 5).length; i++) {
            System.out.println("outArray[" + i + "] = " + tsk.Array(inArray, 5)[i]);
        }
        System.out.println("Второй аргумент метода больше длины массива");
        Task.Array(inArray, 10);
        Task.Array2();
    }


    protected static class Task {
        private static int out[];
        private static int[] Array(int in[], int count) {
            if (count > in.length) {
                count = in.length;
            }
            out = new int[count];
            for (int i = 0; i < count; i++) {
                out[i] = in[i];
            }
            return out;
        }

        private static void Array2() {
            for (int i = 0; i < Task.out.length; i++) {
                System.out.println("outArray[" + i + "] = " + out[i]);
            }
        }
    }
}