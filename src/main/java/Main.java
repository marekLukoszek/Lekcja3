import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
    Main main = new Main();
    main.doSomething(new ConsolePrinter());

    }

    public void doSomething(ConsolePrinter consolePrinter){
        consolePrinter.print("XYZ");
        consolePrinter.print("ABC");
        consolePrinter.print("ZZZ");
        consolePrinter.print("123");
    }

    public int add(int x, int y){
        return x+y;
    }
}
