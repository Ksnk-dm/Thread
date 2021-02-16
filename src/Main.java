import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Thead(i)).run();
        }
    }
}