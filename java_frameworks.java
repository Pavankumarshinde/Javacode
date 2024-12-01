import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class java_frameworks {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("=== ArrayList ===");
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List: " + list);
        list.add(1, "X"); // Add at specific index
        System.out.println("After adding at index 1: " + list);
        list.remove("C"); // Remove element
        System.out.println("After removing 'C': " + list);
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'B': " + list.contains("B"));

        // Iterating through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

        // HashSet
        System.out.println("\n=== HashSet ===");
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate, won't be added
        set.add("C");
        System.out.println("Set: " + set);
        set.remove("B");
        System.out.println("After removing 'B': " + set);
        System.out.println("Contains 'A': " + set.contains("A"));

        // Iterating through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String item : set) {
            System.out.println(item);
        }

        // TreeSet
        System.out.println("\n=== TreeSet ===");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(3); // Duplicate, won't be added
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        treeSet.remove(1);
        System.out.println("After removing 1: " + treeSet);

        // HashMap
        System.out.println("\n=== HashMap ===");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);
        map.put(2, "Updated Two");
        System.out.println("After updating key 2: " + map);
        System.out.println("Value for key 1: " + map.get(1));
        map.remove(3);
        System.out.println("After removing key 3: " + map);
        System.out.println("Contains key 2: " + map.containsKey(2));

        // Iterating through the HashMap
        System.out.println("Iterating through HashMap:");
        for (var entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Queue
        System.out.println("\n=== Queue ===");
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Queue: " + queue);
        System.out.println("Removed element: " + queue.remove()); // Remove first element
        System.out.println("Peek at first element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        // Iterating through the Queue
        System.out.println("Iterating through Queue:");
        for (String item : queue) {
            System.out.println(item);
        }

        // Stack
        System.out.println("\n=== Stack ===");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek()); // View top element
        System.out.println("Popped element: " + stack.pop()); // Remove top element
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Iterating through the Stack
        System.out.println("Iterating through Stack:");
        for (Integer item : stack) {
            System.out.println(item);
        }
    }
}
