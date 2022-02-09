import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeRunner {
    public static void main(String[] args) {
        System.out.println(getTime());
    }

    private static ZonedDateTime getTime() {
        return ZonedDateTime
                .parse(ZonedDateTime
                        .now(ZoneId.of("Europe/Moscow"))
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX")));
    }
}
