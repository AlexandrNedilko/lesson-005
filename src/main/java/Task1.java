//1. Create ArrayList and print it.

import java.util.*;

    public class Task1 {

        public static void main(String[] args)
        {
            int element = 5;

            ArrayList<Integer> mark = new ArrayList<Integer>();
            for (int i = 0; i < element; i++)
            {
                mark.add(i, (int)(Math.random() * 10 + 1));
            }
            System.out.println(mark);

        }
    }