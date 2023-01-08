package lr6;

class Task {
    private char ch;
    private String str;

    public void Field(char a) {
        ch = a;
        System.out.println("Если метод вызывается с символьным аргументом, значит соответствующее значение присваивается символьному полю: "+ch);
    }

    public void Field(String b) {
        str = b;
        System.out.println("Если метод вызывается с текстовым аргументом, значит он определяет значение текстового поля: "+str);
    }

    public void Field(char [] CharArray) {
        if (CharArray.length == 1) {
            ch = CharArray[0];
            System.out.println("Если массив состоит из одного элемента, значит он определяет значение символьного поля: " + ch);
        } else {
            str = new String(CharArray);
            System.out.println("Если в массиве больше одного элемента, значит из символов массива формируется текстовая строка и присваивается значением текстовому полю: " + str);
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        Task c = new Task();
        c.Field('J');
        c.Field("A");
        char[] CharArray1 = {'J','a','v','a'};
        char[] CharArray2 = {'V'};
        c.Field(CharArray1);
        c.Field(CharArray2);
    }
}
