package baseball;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void makeNumberTest() {
        Number number = new Number();
        String result = number.makeNumber();
        assertThat(result).isNotNull();
        assertThat(result).hasSize(number.DEFAULT_LENGTH);

        Set<Integer> set = new HashSet<>();
        // set은 중복을 허용하지 않으므로, 각 숫자가 다 다른 경우 set의 길이는 DEFAULT_LENGTH 여야 한다.
        for (int i = 0; i < number.DEFAULT_LENGTH; i++) {
            set.add(Integer.parseInt(String.valueOf(result.charAt(i))));
        }
        assertThat(set).hasSize(number.DEFAULT_LENGTH);
    }



}
