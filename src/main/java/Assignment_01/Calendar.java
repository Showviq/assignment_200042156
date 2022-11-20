package Assignment_01;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    public boolean isLastDayOfMonth(Date d)
    {
        List<Integer> days_31 = Arrays.asList(1,3,5,7,8,10,12);
        boolean lastDayOfFebruary = (isLeapYear(d) && isFebruary(d) && d.Day==29) || (!isLeapYear(d) && isFebruary(d) && d.Day ==28);
        boolean lastDayOfOtherMonths = (d.Day==31 && days_31.contains(d.Month)) || (d.Day==30 && !days_31.contains(d.Month));
        return  lastDayOfFebruary || lastDayOfOtherMonths;
    }
    public boolean isLeapYear(Date d) {
        return (d.Year % 400 == 0 || (d.Year % 4 == 0 && d.Year % 100 != 0));
    }
    public boolean isFebruary(Date d) {
        return d.Month == 2;
    }
    public boolean isLastDayOfYear(Date d){
        return (d.Month==12 && d.Day==31);
    }
    public Date next_day(Date d)
    {
        int Month = d.Month;
        int Day = d.Day;
        int Year = d.Year;
        if(isLastDayOfYear(d))
        {
            Day=1;
            Month=1;
            Year++;
        }
        else if(isLastDayOfMonth(d))
        {
            Day=1;
            Month++;
        }
        else{
            Day++;
        }
        Date t_date = new Date(Day, Month, Year);
        return t_date;
    }

}

