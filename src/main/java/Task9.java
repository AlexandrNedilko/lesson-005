/*"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
        Create HashSet<Integer> and add all unique numbers from the ArrayList."*/
import java.util.ArrayList;
import java.util.Arrays;


   import java.util.HashSet;

   public class Task9 {
       public static void main(String[] args) {

           System.out.println("Random numbers between 1 and 100 are,");
           for(int i=0; i < 5 ; i++)
               System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*100));

            // Create HashSet.
            HashSet<String> hash = new HashSet<>();
            hash.add("81");
            hash.add("32");
            hash.add("81"); // Duplicate element.
            hash.add("51");
            hash.add("99");
            hash.add("34");

            // Display size.
            System.out.println(hash.size());

            // See if these three elements exist.
            System.out.println(hash.contains("81"));
            System.out.println(hash.contains("32"));
            System.out.println(hash.contains("51"));
            System.out.println(hash.contains("99"));
            System.out.println(hash.contains("34"));
        }
    }