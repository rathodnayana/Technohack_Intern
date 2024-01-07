import java.security.SecureRandom;

public class RandomPasswordGenerator {

    // Define characters for generating the password
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:'<>,.?/";

    public static void main(String[] args) {
        // Specify the length of the password
        int passwordLength = 12;

        // Generate a random password
        String password = generateRandomPassword(passwordLength);

        // Print the generated password
        System.out.println("Generated Password: " + password);
    }

    private static String generateRandomPassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Use a mix of characters to create a strong password
        String allCharacters = LOWERCASE_CHARS + UPPERCASE_CHARS + DIGITS + SPECIAL_CHARS;

        for (int i = 0; i < length; i++) {
            // Get a random index to pick a character from the pool
            int randomIndex = random.nextInt(allCharacters.length());

            // Append the randomly selected character to the password
            password.append(allCharacters.charAt(randomIndex));
        }

        return password.toString();
    }
}
