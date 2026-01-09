import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        /*
         * =========================
         * BASE DATES
         * =========================
         */

        // LocalDate -> date only (no time, no timezone)
        LocalDate d04 = LocalDate.parse("2026-01-09");

        // LocalDateTime -> date + time (no timezone)
        LocalDateTime d05 = LocalDateTime.parse("2026-01-09T01:49");

        // Instant -> global moment (UTC, requires seconds)
        Instant d06 = Instant.parse("2026-01-09T01:49:34Z");

        /*
         * =========================
         * CONVERTING GLOBAL (Instant)
         * TO LOCAL DATE / TIME
         * =========================
         */

        // Convert Instant to LocalDate using system timezone
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        // Convert Instant to LocalDate using a specific timezone
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        // Convert Instant to LocalDateTime using system timezone
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        // Convert Instant to LocalDateTime using a specific timezone
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        /*
         * =========================
         * OUTPUT - CONVERSIONS
         * =========================
         */

        System.out.println("r1 = " + r1); // local date (system default)
        System.out.println("r2 = " + r2); // local date (Portugal)
        System.out.println("r3 = " + r3); // local date-time (system default)
        System.out.println("r4 = " + r4); // local date-time (Portugal)

        /*
         * =========================
         * EXTRACTING DATE FIELDS
         * =========================
         */

        // LocalDate fields
        System.out.println("d04 day   = " + d04.getDayOfMonth());
        System.out.println("d04 month = " + d04.getMonthValue());
        System.out.println("d04 year  = " + d04.getYear());

        /*
         * =========================
         * EXTRACTING TIME FIELDS
         * =========================
         */

        // LocalDateTime fields
        System.out.println("d05 hour    = " + d05.getHour());
        System.out.println("d05 minute  = " + d05.getMinute());
        System.out.println("d05 second  = " + d05.getSecond());
    }
}

