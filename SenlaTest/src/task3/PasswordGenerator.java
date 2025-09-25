package task3;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final String ALL_CHARS = LOWERCASE + UPPERCASE + DIGITS + SPECIAL;
    private static final SecureRandom random = new SecureRandom();

    private static char getRandChar(String characters) {
        return characters.charAt(random.nextInt(characters.length()));
    }

    public static String generate(int length) {
        StringBuilder password = new StringBuilder();

        password.append(getRandChar(LOWERCASE));
        password.append(getRandChar(UPPERCASE));
        password.append(getRandChar(DIGITS));
        password.append(getRandChar(SPECIAL));

        for (int i = 0; i < (length - 4); ++i) {
            password.append(getRandChar(ALL_CHARS));
        }

        return password.toString();
    }


}
