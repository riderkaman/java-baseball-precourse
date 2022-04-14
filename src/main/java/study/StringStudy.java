package study;

public class StringStudy {

    public static String[] stringSplit(String s) {
        return s.split(",");
    }

    public static String stringSub(String s) {
        return s.substring(s.indexOf("(") + 1).substring(0, s.indexOf(")") - 1);
    }

    public static Character stringCharAt(String s, int i) {

        return s.charAt(i);
    }
}
