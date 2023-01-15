package lr7.lr7_2;

public class Example2 {
    public static void main(String[] args) {
        superClassTest Task1 = new superClassTest();
        String superClassTask1 = Task1.toString();
        System.out.println(superClassTask1);

        superClassTest Task2 = new superClassTest("Java is the best");
        String superClassTask2 = Task2.toString();
        System.out.println(superClassTask2);

        superClassTest Task3 = new subClassTest();
        String subClassTask3 = Task3.toString();
        System.out.println(subClassTask3);

        superClassTest Task4 = new subClassTest("Java is great");
        String subClassTask4 = Task4.toString();
        System.out.println(subClassTask4);

        superClassTest Task5 = new subClassTest(10);
        String subClassTask5 = Task5.toString();
        System.out.println(subClassTask5);

        superClassTest Task6 = new subClassTest("Java is good", 10);
        String subClassTask6 = Task6.toString();
        System.out.println(subClassTask6);
    }
}
