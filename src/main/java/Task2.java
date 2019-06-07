//2. Create ENUM and print.
public class Task2 {
         public static void main(String[] args) throws Exception {
            System.out.println(Strings.Orc.name());
            System.out.println(Strings.Halfling.name());
            System.out.println(Strings.Heroes.name());
        }
    }

    enum Strings {
        Orc, Halfling, Heroes
    }