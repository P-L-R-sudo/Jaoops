import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter timeFormatter12Hour = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time.format(timeFormatter12Hour));
    }
    
}
