package lr7.lr7_5;

public class FirstSubTwoClass extends FirstSubOneClass {

    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    FirstSubTwoClass(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }

    @Override
    public void ToString() {
        String SecondField =
                "int: \"" + this.getInt1()+"\"";
        super.ToString();
        System.out.println(SecondField);
    }
    public int getInt1() {
        return int1;
    }
}