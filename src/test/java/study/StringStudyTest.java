package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("String 클래스에 대한 학습 테스트")
class StringStudyTest {

    @Test
    @DisplayName("split 메소드 학습 테스트")
    void stringSplitTest() {
        String[] result = StringStudy.stringSplit("1,2");
        assertThat(result).contains("1", "2").containsExactly("1", "2");
        result = StringStudy.stringSplit("3,4");
        assertThat(result).contains("3", "4").containsExactly("3", "4");
        result = StringStudy.stringSplit("1");
        assertThat(result).contains("1").containsExactly("1");
    }

    @Test
    @DisplayName("substring 메소드 학습 테스트")
    void stringSubTest() {
        String result = StringStudy.stringSub("(1,2)");
        assertThat(result).isEqualTo("1,2");
        result = StringStudy.stringSub("(3,4)");
        assertThat(result).isEqualTo("3,4");
    }

    @Test
    @DisplayName("charAt 메소드 학습 테스트")
    void stringCharAtTest() {
        /*Character result = StringStudy.stringCharAt("abc", 0);
        assertThat(result).isEqualTo('a');
        result = StringStudy.stringCharAt("abc", 1);
        assertThat(result).isEqualTo('b');*/


        assertThatThrownBy(() -> {
            StringStudy.stringCharAt("abc", 5);

        }).isInstanceOf(IndexOutOfBoundsException.class)
          .hasMessageContaining("out of range");


    }

}