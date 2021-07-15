import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FirstTest {

    @Test
    void shouldOpen() {
        String date = "28.11.2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.for

        Assertions.assertEquals(DayOfWeek.SATURDAY, localDate.getDayOfWeek());
    }
}
