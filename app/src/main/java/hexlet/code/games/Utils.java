package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static int generateNumber(int n) {
        Random random = new Random();
        return random.nextInt(n);
    }
}
