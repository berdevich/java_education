package lr7.lr7_3;

public class Example3 {
    public static void main(String[] args) {
        FirstSubClass superClassTask1 = new FirstSubClass(10);
        String classTask1 = superClassTask1.toString();
        System.out.println(classTask1);

        SecondSubClass FirstSubClassTask2= new SecondSubClass(100,'J');
        String classTask2 = FirstSubClassTask2.toString();
        System.out.println(classTask2);

        ThirdSubClass SecondSubClassTask3 = new ThirdSubClass(1000,'J',"Java");
        String classTask3 = SecondSubClassTask3.toString();
        System.out.println(classTask3);
    }
}