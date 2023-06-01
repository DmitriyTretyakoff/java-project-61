package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateNumber(int count) {
        Random random = new Random();
        return random.nextInt(count);
    }
}
