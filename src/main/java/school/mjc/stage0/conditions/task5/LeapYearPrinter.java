package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        boolean leap = false;

        if (year % 4 == 0)
            if (year % 100 == 0)
                leap = year % 400 == 0;
            else leap = true;

        if (leap)
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
}


