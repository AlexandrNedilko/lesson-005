/*6. Create ArrayList of Strings. Add 10 different Strings to it.
//Using any cycle find the longest String in the list and print it out.
//If there are several String with the same legth - print each from a new line."
*/
/*"1) Create ArrayList of String and initialize it. " +
  "2) All values with the highest length should be printed out."*/


import java.util.ArrayList;
import java.io.*;

public class Task6 {
        public static void main(String[] args){
            Reader r = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(r);
            ArrayList<String> list = new ArrayList<String>();
            int i = 0;
            for (;i < 10;) {
                System.out.print("Введите слово №"+(++i)+": ");
                try {
                    list.add(reader.readLine());
                } catch (IOException e) {
                    System.out.println("ошибка ввода-вывода");
                } // catch
            } // for

            i = 0;
            int cur, indexOfMax = 0, maxLen = list.get(0).length();
            while (i < list.size()-1) {
                cur = list.get(++i).length();
                if (cur > maxLen) {
                    indexOfMax = i;
                    maxLen = cur;
                } //if
            } //while
            System.out.println("Слово максимальной длины: "+list.get(indexOfMax)+", длина: "+maxLen);
        }//main
    } //class

