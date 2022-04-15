package baseball;

import camp.nextstep.edu.missionutils.Console;

public class IOController {

    public static String gameNumberInput() {
        System.out.println("숫자를 입력해주세요: ");
        String input = Console.readLine();

        return input;
    }

    public static String gameContinueInput() {
        System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.: ");
        String input = Console.readLine();

        return input;
    }



}
