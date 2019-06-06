//2. Create ENUM and print.
public class Task2 {
         public static void main(String[] args) throws Exception {
            System.out.println(Strings.Orc.name());
            System.out.println(Strings.Hafling.name());
            System.out.println(Strings.Heroes.name());
        }
    }

    enum Strings {
        Orc, Hafling, Heroes
    }