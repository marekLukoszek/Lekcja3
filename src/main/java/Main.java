import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hej");
            System.out.println("Dwa");
            System.out.println("Albo trzy");
        }

        System.out.println(LocalDateTime.now());

        System.out.println("Test branch1");
        int x = 9;
        do {
            System.out.println("kolejna pętla");
            x--;
        } while (x > 0);

    }
}
