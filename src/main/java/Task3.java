import java.util.HashMap;
import java.util.Map;

//3. Create Map vehicles : vehicles.put("BMW", 5);, print
public class Task3 {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        myHashMap.put("https://data.bmw.ua/pricelist/X2_F39_Pricelist.pdf", "X2 xDrive 20i");
        myHashMap.put("https://data.bmw.ua/pricelist/X3_G01_Pricelist.pdf", "X3 xDrive 20i");
        myHashMap.put("https://data.bmw.ua/pricelist/X4_G02_Pricelist.pdf", "X4 xDrive 20i");
        myHashMap.put("https://data.bmw.ua/pricelist/X5_G05_Pricelist.pdf", "X5 xDrive 40i");
        myHashMap.put("https://data.bmw.ua/pricelist/8_Series_G15_Pricelist.pdf", "M850i");
        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}