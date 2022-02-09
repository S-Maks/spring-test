import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Main {
    static Logger demoLogger = LoggerFactory.getLogger("Main");

    public static void main(String[] args) {
        MDC.put("userId", "gquintana");
        demoLogger.info("Hello world!");
        MDC.remove("userId");
    }
}
