import java.io.FileNotFoundException;

public class Main {
    private static void debugger() {}
    public static void main(String[] args) throws FileNotFoundException {
        // 1. feladat: Jackie

        // 2. feladat
        JackieService service = new JackieService("files/jackie.txt");
        debugger();
    }
}