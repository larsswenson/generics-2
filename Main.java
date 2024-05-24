import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println(pair);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack is empty: " + stack.isEmpty());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(1);
        intList.add(2);
        SortUtility.sort(intList);
        System.out.println("Sorted Integers: " + intList);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Cynthia");
        strList.add("Gerald");
        strList.add("Atticus");
        SortUtility.sort(strList);
        System.out.println("Sorted List: " + strList);

        List<Integer> intList2 = List.of(1, 2, 3, 4);
        CollectionUtils.printCollection(intList2);
        System.out.println("Sum: " + CollectionUtils.sumOfNumberList(intList2));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        CollectionUtils.printCollection(doubleList);
        System.out.println("Sum: " + CollectionUtils.sumOfNumberList(doubleList));

        Cache<String> stringCache = new Cache<>();
        stringCache.add("key1", "value1");
        stringCache.add("key2", "value2");

        Cache<String> anotherStringCache = new Cache<>();
        anotherStringCache.add("key3", "value3");

        stringCache.addAll(anotherStringCache);
        System.out.println("Contents of cache: " + stringCache.get("key1") + ", " + stringCache.get("key2") + ", " + stringCache.get("key3"));
    }
}

