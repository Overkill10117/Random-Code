import java.util.Scanner;

public class Spam {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String smh = scanner.nextLine();
        if (smh.equals("spam")) {
            int i = 0;
            while(true) {
                System.out.println("Spam " + i + " out of infinity");
                i++;
            }
        }
    }
