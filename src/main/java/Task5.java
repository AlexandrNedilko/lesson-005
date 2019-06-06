//"5. Create ArrayList of Strings. Add 5 different Strings to it.
//Using any cycle print all the values of the ArrayList to the console."
/*"1) Create ArrayList of String and initialize it.
        2) The size of the ArrayList should be printed to the console.
        3) All values should be printed to the console (each from a new line)"*/
import java.util.ArrayList;
public class Task5 {

        public static void main (String[]args)
        {
            // Create an ArrayList that holds references to String
            ArrayList<String> names = new ArrayList<String>();

            // Capacity starts at 10, but size starts at 0
            System.out.println("initial size: " + names.size());

            // Add three String references
            names.add("Hulk");
            names.add("Iron Man");
            names.add("Thor");
            names.add("Captain America");
            names.add("Wolverine");
            System.out.println("new size: " + names.size());

            // Access and print out the Objects
            for (int j = 0; j < names.size(); j++)
                System.out.println("element " + j + ": " + names.get(j));
        }
    }




