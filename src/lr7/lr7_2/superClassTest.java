package lr7.lr7_2;

public class superClassTest {
    private String str1;
    superClassTest() {
        setStr1();
    }
    superClassTest (String str1) {
        setStr1(str1);
    }
    public void setStr1 () {
        this.str1 = "Без параметров";
    }

    //С одним текстовым параметром:
    public void setStr1 (String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    //Возвращает длину текстовой строки:
    public int getStr1length() {
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "SuperClass: " + "str1 = \"" + getStr1() + '\"' + " Длина строки: " +"\""+getStr1length()+"\"";
        return superClassNameAndFieldValue;
    }
}