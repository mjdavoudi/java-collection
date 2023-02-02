package q1;

import q1.utils.TimeCalculator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> linkedList = new Random().ints(
                5000000, 1, 100
        ).boxed().collect(Collectors.toCollection(LinkedList::new));

        List<Integer> arrayList = new Random().ints(
                5000000, 1, 100
        ).boxed().collect(Collectors.toCollection(ArrayList::new));

        Set<Integer> hashSet = new Random().ints(
                5000000, 1, 100
        ).boxed().collect(Collectors.toCollection(HashSet::new));

        System.out.println("add time for linked list is: " + TimeCalculator.addTime(linkedList));
        System.out.println("add time for array list is: " + TimeCalculator.addTime(arrayList));
        System.out.println("add time for hash set is: " + TimeCalculator.addTime(hashSet));
        System.out.println("==================================================");
        System.out.println("contains time for linked list is: " + TimeCalculator.containsTime(linkedList));
        System.out.println("contains time for array list is: " + TimeCalculator.containsTime(arrayList));
        System.out.println("contains time for hash set is: " + TimeCalculator.containsTime(hashSet));
        System.out.println("==================================================");
        System.out.println("remove time for linked list is: " + TimeCalculator.removeTime(linkedList));
        System.out.println("remove time for array list is: " + TimeCalculator.removeTime(arrayList));
        System.out.println("remove time for hash set is: " + TimeCalculator.removeTime(hashSet));

    }
}
