package q2.utils;

import java.util.HashMap;
import java.util.Map;

public class StringChecker {
    private StringChecker() {

    }

    public static boolean isUnique(String string) {
        Map<Character, Boolean> map = new HashMap<>();

        for (char ch: string.toCharArray()) {
            if (map.containsKey(ch)) {
                return false;
            }
            map.put(ch, true);
        }
        return true;
    }
}
