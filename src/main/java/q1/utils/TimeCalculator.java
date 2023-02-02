package q1.utils;

import java.util.Collection;

public class TimeCalculator {
    private TimeCalculator() {
    }

    public static Long addTime(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();
        collection.add(400);
        return System.currentTimeMillis() - startTime;
    }

    public static Long containsTime(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();
        collection.contains(400);
        return System.currentTimeMillis() - startTime;

    }

    public static Long removeTime(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();
        collection.remove(400);
        return System.currentTimeMillis() - startTime;
    }
}
