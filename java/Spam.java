import java.util.Scanner;
// This will never stop until you stop the program
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
