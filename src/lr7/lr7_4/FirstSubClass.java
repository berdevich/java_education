package lr7.lr7_4;

public class FirstSubClass {
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    FirstSubClass (char char1) {
        this.setChar1(char1);
    }
    //Конструктор копии:
    FirstSubClass (FirstSubClass copy) {
        this.setChar1(copy.char1);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Название класса: " + this.getClass().getSimpleName() + "\n" +
                        "char: " + this.getChar1();
        return ClassNameAndFieldValue;
    }
    public char getChar1() {
        return char1;
    }
}