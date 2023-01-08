package lr6;

public class Example2 {
    public static class Task {
        private static int field;
        public static void view() {
            System.out.println(field);
            field++;
        }
    }
    public static void main(String[] args) {
        Task tsk = new Task();
        tsk.view();
        tsk.view();
        tsk.view();
        tsk.view();
    }
}
