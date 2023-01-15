package lr7.lr7_5;

public class SecondSubClass extends FirstSubOneClass {

    protected char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    SecondSubClass(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
    }

    @Override
    public void ToString() {
        String SecondField =
                "char: \"" + this.getChar1()+"\"";
        super.ToString();
        System.out.println(SecondField);
    }
    public char getChar1() {
        return char1;
    }
}