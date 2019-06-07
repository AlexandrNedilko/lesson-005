/*"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
        Create HashSet<Integer> and add all unique numbers from the ArrayList."*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Task9 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<100; i++) {
             list.add(1 + (int)(Math.random()*100));
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("******");
        System.out.println("List size "+list.size());
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("set size "+set.size());
        System.out.println("******");
    }
}


