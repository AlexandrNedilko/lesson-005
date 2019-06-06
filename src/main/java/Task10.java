/*"10. Create enum for days of the week.
        Write a program which will be printing the number of a day according to day of the week.
        Example:
        If today is Sunday - print 1;
        If today is Monday - print 2
        ..."

        1) Use switch(day of the week) to pass the day of the week.*/
public class Task10 {
    public static void main(String[] args) {
        Strings[] days =Strings.values();

        switch (days[0]) {
            case Monday:
                System.out.println(" If today is Monday - print 1");
                //break;
            case Tuesday:
                System.out.println(" If today is Tuesday - print 2");
                //break;
            case Wednesday:
                System.out.println(" If today is Wednesday - print 3");
                //break;
            case Thursday:
                System.out.println(" If today is Thursday - print 4");
                //break;
            case Friday:
                System.out.println(" If today is Friday - print 5");
                //break;
            case Saturday:
                System.out.println(" If today is Saturday - print 6");
                //break;
            case Sunday:
                System.out.println(" If today is Sunday - print 7");
                //break;
        }
    }

    enum Strings {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
}
