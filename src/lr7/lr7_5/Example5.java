package lr7.lr7_5;

public class Example5 {
    public static void main(String[] args) {
        FirstSubOneClass SuperClassTask1 = new FirstSubOneClass("Java is the best");
        SuperClassTask1.ToString();

        FirstSubTwoClass SubClassTask1= new FirstSubTwoClass("Java is great", 100);
        SubClassTask1.ToString();

        SecondSubClass SubClassTask2 = new SecondSubClass("Java is good", 'J');
        SubClassTask2.ToString();

        FirstSubOneClass SuperClassTask2 = new FirstSubOneClass(SubClassTask1.getStr1());
        SuperClassTask2.ToString();

        FirstSubOneClass SuperClassTask3 = new FirstSubOneClass(SubClassTask2.str1);
        SuperClassTask3.ToString();
    }
}
