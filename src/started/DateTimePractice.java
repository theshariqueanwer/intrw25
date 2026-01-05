package started;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
    static void main() {
        System.out.println("DateTimePractice");

        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        DateTimeFormatter usDateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String usFormattedDate = today.format(usDateTimeFormatter);
        System.out.println("US Formatted Date: " + usFormattedDate);


        DateTimeFormatter inDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String inFormattedDate = today.format(inDateTimeFormatter);
        System.out.println("IN Formatted Date: " + inFormattedDate);



        String usDateString = "2025-12-10";
        LocalDate parsedDate = LocalDate.parse(usDateString);
        System.out.println("Parsed Date: " + parsedDate);

        LocalDate customParsedDate = LocalDate.parse("10/12/2025", inDateTimeFormatter);
        System.out.println("Custom Parsed Date: " + customParsedDate);

        // LocalDate failedDate = LocalDate.parse(usDateString);
        // System.out.println("Failed Parsed Date: " + failedDate);

        LocalDate theDate = LocalDate.parse(usDateString, DateTimeFormatter.ISO_DATE);
        System.out.println("The Date: " + theDate);


    }
}
