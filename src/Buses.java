import java.util.Scanner;

public class Buses {
    public static void main(String[] args) {
        final int busHeight = 437;
        Scanner input = new Scanner(System.in);
        int numberOfBridges;

        numberOfBridges = input.nextInt();

        for (int i = 1; i <= numberOfBridges; i++) {
            if (input.nextInt() <= busHeight) {
                System.out.println("Crash " + String.valueOf(i));
                return;
            }
        }

        System.out.println("No crash");
    }
}