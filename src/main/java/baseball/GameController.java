package baseball;

import java.util.HashSet;
import java.util.Set;

public class GameController {

    public static final int DEFAULT_LENGTH = 3;

    public static void gameStart() {

        Number num = new Number();

        boolean isGameContinue = true;
        while (isGameContinue) {

            String input = IOController.gameNumberInput();

            isGameContinue = isCorrectNumber(input);


        }

    }

    public static boolean isCorrectNumber(String input) {

        if (numberCorrectChecker(input)) {
            throw new IllegalArgumentException();
        }

        return true;
    }

    private static boolean numberCorrectChecker(String input) {

        if (input == null) {
            return true;
        }

        if (input.length() != DEFAULT_LENGTH) {
            return true;
        }

        final String REGEX = "[0-9]+";
        if (!input.matches(REGEX)) {
            return true;
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }

        if (set.size() != DEFAULT_LENGTH) {
            return true;
        }

        return false;
    }

}
