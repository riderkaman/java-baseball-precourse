package baseball;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    @ParameterizedTest
    @ValueSource(strings = {"dasdf", "112", "   "})
    void isCorrectNumberTest(String input) {
        assertThatThrownBy(() -> GameController.isCorrectNumber(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}