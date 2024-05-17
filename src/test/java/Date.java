import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date
{

    @Test
    public void testDate()
    {
        String s = "18-12-2024";
        // Parse the input string to local date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(s, formatter);

        // Format the LocalDate to desired output format
        String output = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(output);
    }

    @Test
    public void toPrintLocalSystemDate()
    {
        LocalDate currentDate = LocalDate.now();
        String localCurrentDate = currentDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("The current date of the system is : " + localCurrentDate);

        String newFormat = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(newFormat);
    }

    @Test
    public void toPrintFormattedDate()
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        String formattedDate = dateFormat.format(currentDate);
        System.out.println("CurrentDate: " + formattedDate);
    }

    @Test
    public void testAdvanceDate()
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(20);
        String presentDay = currentDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        String futureDay = futureDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(presentDay);
        System.out.println(futureDay);
    }
}
