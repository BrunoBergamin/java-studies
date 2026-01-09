import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * =========================
         * DATE / TIME OBJECTS
         * =========================
         */

        // LocalDate -> date only (no time)
        LocalDate d04 = LocalDate.parse("2026-01-09");

        // LocalDateTime -> date + time (no timezone)
        LocalDateTime d05 = LocalDateTime.parse("2026-01-09T11:49");

        // Instant -> global moment (UTC, requires seconds)
        Instant d06 = Instant.parse("2026-01-09T11:49:34Z");

        /*
         * =========================
         * FORMATTERS
         * =========================
         */

        // Custom date format
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Custom date + time format
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Formatter with system timezone (required for Instant)
        DateTimeFormatter fmt3 = DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());

        // ISO standard format (date + time)
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        // ISO standard format for Instant (UTC)
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        /*
         * =========================
         * OUTPUT - LocalDate
         * =========================
         */

        // Three equivalent ways to format LocalDate
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        /*
         * =========================
         * OUTPUT - LocalDateTime
         * =========================
         */

        System.out.println("d05 = " + d05.format(fmt1)); // date only
        System.out.println("d05 = " + d05.format(fmt2)); // date + time
        System.out.println("d05 = " + d05.format(fmt4)); // ISO format

        /*
         * =========================
         * OUTPUT - Instant
         * =========================
         */

        // Instant must be formatted with timezone
        System.out.println("d06 = " + fmt3.format(d06)); // system timezone
        System.out.println("d06 = " + fmt5.format(d06)); // UTC (ISO)
        System.out.println("d06 = " + d06.toString());   // default ISO string

        sc.close();
    }
}
