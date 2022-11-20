package Assignment_01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {
    @Test
    void Next_Day() {
        Calendar Calender = new Calendar();
        Date d = new Date(19,11,2022);
        assertEquals(20 , Calender.next_day(d).Day);
        assertEquals(11, Calender.next_day(d).Month);
        assertEquals(2022 , Calender.next_day(d).Year);
    }
    @Test
    void Next_Month() {
        Calendar Calender = new Calendar();
        Date d = new Date(30,11,2022);
        assertEquals(1 , Calender.next_day(d).Day);
        assertEquals(12, Calender.next_day(d).Month);
        assertEquals(2022 , Calender.next_day(d).Year);
    }
    @Test
    void Next_Year() {
        Calendar Calender = new Calendar();
        Date d = new Date(31,12,2022);
        assertEquals(1 , Calender.next_day(d).Day);
        assertEquals(1, Calender.next_day(d).Month);
        assertEquals(2023 , Calender.next_day(d).Year);
    }
    @Test
    void LeapYear_Feb() {
        Calendar Calender = new Calendar();
        Date d = new Date(28,2,2000);
        assertEquals(29 , Calender.next_day(d).Day);
        assertEquals(2, Calender.next_day(d).Month);
        assertEquals(2000 , Calender.next_day(d).Year);
    }
    @Test
    void Not_LeapYear_Feb() {
        Calendar Calender = new Calendar();
        Date d = new Date(28,2,2022);
        assertEquals(1 , Calender.next_day(d).Day);
        assertEquals(3, Calender.next_day(d).Month);
        assertEquals(2022 , Calender.next_day(d).Year);
    }

}
