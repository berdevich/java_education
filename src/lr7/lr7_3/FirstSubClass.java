package lr7.lr7_3;

public class FirstSubClass {
    public int int1;
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    FirstSubClass(int int1) {
        this.setInt1(int1);
    }
    public String toString() {
        String ClassNameFieldValue;
        ClassNameFieldValue =
                "Название класса: " + this.getClass().getSimpleName() + "\n" +
                        "int: " + this.getInt1();
        return ClassNameFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}
