package lr5;

public class Example1 {
    public static void main(String[] args) {
        Task Ex = new Task();
        Ex.viewCode();
        Ex.Set('g');
        System.out.println("Code = " + Ex.getCodeSymbol()+"\n");
        Ex.viewCode();
    }
}
class Task {
    private char n;
    public void Set(char n2) {
        this.n = n2;
    }
    public int getCodeSymbol() {
        return (int) n;
    }
    public void viewCode() {
        System.out.println("n2 = " + n);
        //int code = ch;
        System.out.println("n2 = " + getCodeSymbol()+"\n");
    }
}
