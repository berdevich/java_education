package lr7.lr7_2;

public class subClassTest extends superClassTest {
    private String str2;
    public int int1;

    subClassTest() {
        setStr1();
    }

    //С текстовым параметром:
    subClassTest(String str2) {
        setStr1(str2);
    }

    //С целочисленным параметром:
    subClassTest(int int1) {
        setStr1();
        this.setInt1(int1);
    }

    //С текстовым и целочисленным параметром:
    subClassTest(String str2, int int1) {
        setStr1(str2);
        this.setInt1(int1);
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 () {
        this.str2 = "Без параметров";
    }

    public void setStr1 (String str2) {
        this.str2 = str2;
    }

    public int getInt1() {
        return int1;
    }

    public String getStr1() {
        return str2;
    }

    public int getStr1length() {
        return str2.length();
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue = "SubClass: " + "str2 = \"" + getStr1() + '\"' + " Длина строки: " +"\""+getStr1length()+"\""
                +"\nSubClass: " + "int = \"" + getInt1() + "\"";
        return ClassNameAndFieldValue;
    }

}