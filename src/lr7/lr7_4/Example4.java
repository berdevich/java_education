package lr7.lr7_4;

public class Example4 {
    public static void main(String[] args) {

        FirstSubClass superClassTask1 = new FirstSubClass('J');
        String classTask1 = superClassTask1.toString();
        System.out.println(classTask1);

        FirstSubClass superClassTask1Copy = new FirstSubClass(superClassTask1);
        String classTask1Copy = superClassTask1Copy.toString();
        System.out.println(classTask1Copy);

        SecondSubClass FirstSubClassTask2 = new SecondSubClass('J',"Java");
        String classTask2 = FirstSubClassTask2.toString();
        System.out.println(classTask2);

        SecondSubClass FirstSubClassTask2Copy = new SecondSubClass(FirstSubClassTask2);
        String classTask2Copy = FirstSubClassTask2Copy.toString();
        System.out.println(classTask2Copy);

        ThirdSubClass SecondSubClassTask3 = new ThirdSubClass('J',"Java",100);
        String classTask3 = SecondSubClassTask3.toString();
        System.out.println(classTask3);

        ThirdSubClass SecondSubClassTask3Copy = new ThirdSubClass(SecondSubClassTask3);
        String classTask3Copy = SecondSubClassTask3Copy.toString();
        System.out.println(classTask3Copy);
    }
}
