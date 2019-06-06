/*
"8. Create HashMap<String, String> and add 10 pairs:
        watermelon, berry;
        banana, fruit;
        cherry, berry;
        pineapple, fruit;
        melon, vegetable;
        cranberry, berry;
        apple, fruit;
        iris, flower;
        potato, vegetable;
        carrot, vegetable;
        Print only vegetables to the console."


        1) Do not use predefined keys to get vegetables. You should use conditions to find vegetables.

        "1) Map iterator;
        2) Map.Entry
        3) Foreach"*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        Map<String, String> foodFruits = new HashMap<>();
        foodFruits.put("watermelon", "berry");
        foodFruits.put("banana", "fruit");
        foodFruits.put("cherry", "berry");
        foodFruits.put("pineapple", "fruit");
        foodFruits.put("melon", "vegetable");
        foodFruits.put("cranberry", "berry");
        foodFruits.put("apple", "fruit");
        foodFruits.put("iris", "flower");
        foodFruits.put("potato", "vegetable");
        foodFruits.put("carrot", "vegetable");

        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        foodFruits.forEach((employee, salary) -> {
            System.out.println(employee + " => " + salary);
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, String>> foodFruitsEntries = foodFruits.entrySet();
        Iterator<Map.Entry<String, String>> foodFruitsIterator = foodFruitsEntries.iterator();
        while (foodFruitsIterator.hasNext()) {
            Map.Entry<String, String> entry = foodFruitsIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        foodFruits.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });

        System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
        for(Map.Entry<String, String> entry: foodFruits.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n=== Iterating over the HashMap's keySet ===");
        foodFruits.keySet().forEach(employee -> {
            System.out.println(employee + " => " + foodFruits.get(employee));
        });
    }
}