package lr7.lr7_5;

public class FirstSubOneClass {

    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    FirstSubOneClass(String str1) {
        this.setStr1(str1);
    }

    public void ToString() {
        String ClassNameFieldValue;
        ClassNameFieldValue =
                "\nНазвание класса: " + this.getClass().getSimpleName() + "\n" +
                        "String: \"" + this.getStr1()+"\"";
        System.out.println(ClassNameFieldValue);
    }
    public String getStr1() {
        return str1;
    }
}