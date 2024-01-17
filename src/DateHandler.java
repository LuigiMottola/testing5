import java.time.OffsetDateTime;

public class DateHandler {

    public OffsetDateTime modificaData(OffsetDateTime dateTime){
        OffsetDateTime result = dateTime.plusYears(1).minusMonths(1).plusDays(7);
        return result;
    }
}