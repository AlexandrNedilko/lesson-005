/*"7. Create HashMap<String, String> and add 10 pairs:
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

        Print the content of the map, each pair from a new line.
        Example:
        watermelon - berry;
        cherry - berry;
        ..."*/

import java.util.HashMap;
import java.util.Map;
public class Task7 {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("watermelon", "berry");
        myHashMap.put("banana", "fruit");
        myHashMap.put("cherry", "berry");
        myHashMap.put("pineapple", "fruit");
        myHashMap.put("melon", "vegetable");
        myHashMap.put("cranberry", "berry");
        myHashMap.put("apple", "fruit");
        myHashMap.put("iris", "flower");
        myHashMap.put("potato", "vegetable");
        myHashMap.put("carrot", "vegetable");
        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}
