package lr6;

public class Example10 {
    public static void main(String[] args) {
        Task tsk1 = new Task();
        Task tsk2 = new Task();
        tsk1.calculation(0, 1, 10, -5, 59, -157);
        tsk1.MaxMin2();
        Task.calculation(4, 7, 26, 95, -38, -16, 100, 150);
        Task.MaxMin2();
        tsk2.calculation(0, 15, 81, 19, -64, -69, 163, 181);
        tsk2.MaxMin2();
    }
    protected static class Task{
        private static int[] MaxMin;
        private static int[] calculation(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin = new int[]{max, min};
            return MaxMin;
        }
        private static void MaxMin2() {
            System.out.println("MaxMin[max] = " + MaxMin[0]);
            System.out.println("MaxMin[min] = " + MaxMin[1]);
            System.out.println();
        }
    }
}