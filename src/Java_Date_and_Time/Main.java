package Java_Date_and_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        DateTimeFormatter myDateTimeFormat = DateTimeFormatter
                .ofPattern("dd MM yyyy");

        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);
        System.out.println(myDateTimeFormat);


    }
}
