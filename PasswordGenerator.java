import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Character sets
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*";

        // Combine all characters
        String allChars = upper + lower + numbers + special;

        // Ask user for length
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String password = "";

        // Generate password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        // Output
        System.out.println("Generated Password: " + password);

        sc.close();
    }
}