import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeRunner {
    public static void main(String[] args) {
        //get formatted date
        //System.out.println(getTime());

        //parse date
        date();
    }

    private static ZonedDateTime getTime() {
        return ZonedDateTime
                .parse(ZonedDateTime
                        .now(ZoneId.of("Europe/Moscow"))
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX")));
    }

    private static void date() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yy");
        String filterValue = "1/10/1";
        System.out.println(formatter.parse(filterValue, LocalDate::from));
    }
}
