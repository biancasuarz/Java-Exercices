import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHour {
        public static void main(String[] args) {

            LocalDate d01 = LocalDate.now();
            LocalDateTime d02 = LocalDateTime.now();
            Instant d03 = Instant.now();
            Instant d04 = Instant.parse("2022-09-27");

            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("D01: " + d01);
            System.out.println("D02: " + d02);
            System.out.println("D03: " + d03);
            System.out.println("D04: " + fmt1.format(d04));
        }
    }
