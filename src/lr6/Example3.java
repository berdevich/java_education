package lr6;

public class Example3 {
    private static class Task{
        private static void Max(int ... array){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }
            System.out.println("Максимальное значение: "+max);
        }
        private static void Min(int ... array){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Минимальное значение: "+min);
        }
        private static void Medium(int ... array){
            int med = 0;
            for (int i = 0; i < array.length; i++) {
                med = array[i]+med;
            }
            double med1 = (double)med/array.length;
            System.out.println("Среднее значение: "+med1);
        }
    }
    public static void main(String[] args) {
        Task.Max(0, 1, 2, 4, 16, 64);
        Task.Min(0, -1, -2, -4, 16, -64);
        Task.Medium(0, 1, 2, 4, 16, 64);
    }
}