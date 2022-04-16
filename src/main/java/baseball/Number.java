package baseball;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import camp.nextstep.edu.missionutils.Randoms;

public class Number {

    public int number;

    public final int DEFAULT_LENGTH = 3;

    public String makeNumber() {
        Set<Integer> set = new HashSet<>();

        while (set.size() < DEFAULT_LENGTH) {
            set.add(Randoms.pickNumberInRange(1, 9));
        }

        Iterator<Integer> iter = set.iterator();

        StringBuilder stringBuilder = new StringBuilder();
        while (iter.hasNext()) {
            stringBuilder.append(iter.next());
        }

        return stringBuilder.toString();

    }










}
