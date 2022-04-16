package baseball;

public class GameController {

    public static void gameStart() {

        Number num = new Number();

        boolean isGameContinue = true;
        while (isGameContinue) {

            String input = IOController.gameNumberInput();

            isGameContinue = isCorrectNumber(input);


        }

    }

    public static boolean isCorrectNumber(String input) {





        return false;
    }

}
