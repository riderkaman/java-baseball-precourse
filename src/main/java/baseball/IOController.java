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


    public static String gameResultOutput(String gameResult) {
        System.out.println(gameResult);

        if ("3스트라이크".equals(gameResult)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = Console.readLine();
            return input;
        }

        return "3";
    }
}
