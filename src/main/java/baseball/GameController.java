package baseball;

import java.util.HashSet;
import java.util.Set;

public class GameController {

    public static final int DEFAULT_LENGTH = 3;

    public static void gameStart() {

        Number num = new Number();

        String number = num.makeNumber();;
        String gameContinueFlag = "";
        boolean isGameContinue = true;
        while (isGameContinue) {

            String input = IOController.gameNumberInput();

            isCorrectNumber(input);

            String gameResult = numberToGameResult(input, number);

            gameContinueFlag = IOController.gameResultOutput(gameResult);

            isGameContinue = isGameEnd(gameContinueFlag);

            number = isMakeNewNumber(number, gameContinueFlag, num);
        }

    }

    private static String isMakeNewNumber(String number, String gameContinueFlag, Number num) {
        if ("1".equals(gameContinueFlag)) {
            return num.makeNumber();
        }

        return number;
    }

    private static boolean isGameEnd(String input) {
        if ("1".equals(input) || "3".equals(input)) {
            return true;
        }
        return false;
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

    public static String numberToGameResult(String input, String number) {

        int strikeCnt = 0;
        int ballCnt = 0;

        char[] inputs = input.toCharArray();
        char[] numbers = number.toCharArray();

        if (Character.compare(inputs[0], numbers[0]) == 0) {
            strikeCnt += 1;
        } else if (Character.compare(inputs[0], numbers[1]) == 0 || Character.compare(inputs[0], numbers[2]) == 0) {
            ballCnt += 1;
        }

        if (Character.compare(inputs[1], numbers[1]) == 0) {
            strikeCnt += 1;
        } else if (Character.compare(inputs[1], numbers[0]) == 0 || Character.compare(inputs[1], numbers[2]) == 0) {
            ballCnt += 1;
        }

        if (Character.compare(inputs[2], numbers[2]) == 0) {
            strikeCnt += 1;
        } else if (Character.compare(inputs[2], numbers[0]) == 0 || Character.compare(inputs[2], numbers[1]) == 0) {
            ballCnt += 1;
        }

        StringBuilder stringBuilder = new StringBuilder();

        if (ballCnt > 0) {
            stringBuilder.append(ballCnt);
            stringBuilder.append("볼");
            stringBuilder.append(" ");
        }

        if (strikeCnt > 0) {
            stringBuilder.append(strikeCnt);
            stringBuilder.append("스트라이크");
        }

        if (ballCnt == 0 && strikeCnt == 0) {
            stringBuilder.append("낫싱");
        }

        return stringBuilder.toString().trim();
    }
}
