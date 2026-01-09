import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * =========================
         * FORMATTERS
         * =========================
         * Used to parse / format dates in custom patterns
         */

        // dd/MM/yyyy  -> date without time
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // dd/MM/yyyy HH:mm -> date with hour and minute
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        /*
         * =========================
         * CURRENT DATE / TIME
         * =========================
         */

        // LocalDate -> date only (no time, no timezone)
        LocalDate d01 = LocalDate.now();

        // LocalDateTime -> date + time (no timezone)
        LocalDateTime d02 = LocalDateTime.now();

        // Instant -> exact moment in time (UTC / Z)
        Instant d03 = Instant.now();

        /*
         * =========================
         * PARSING ISO FORMAT
         * =========================
         */

        // ISO format: yyyy-MM-dd
        LocalDate d04 = LocalDate.parse("2026-01-09");

        // ISO format: yyyy-MM-ddTHH:mm:ss
        LocalDateTime d05 = LocalDateTime.parse("2026-01-09T13:04:24");

        // UTC instant (Z = zero offset)
        Instant d06 = Instant.parse("2026-01-09T13:04:24Z");

        // Instant with offset (-03:00 = Brazil)
        Instant d07 = Instant.parse("2026-01-09T13:04:24-03:00");

        /*
         * =========================
         * PARSING CUSTOM FORMAT
         * =========================
         */

        // Custom format using formatter (dd/MM/yyyy)
        LocalDate d08 = LocalDate.parse("09/01/2026", fmt1);

        // Custom format with date + time (dd/MM/yyyy HH:mm)
        LocalDateTime d09 = LocalDateTime.parse("09/01/2026 11:34", fmt2);

        /*
         * =========================
         * CREATING DATES MANUALLY
         * =========================
         */

        // LocalDate.of(year, month, day)
        LocalDate d10 = LocalDate.of(2026, 1, 9);

        // If you need time, use LocalDateTime
        // LocalDateTime.of(year, month, day, hour, minute)
        LocalDateTime d11 = LocalDateTime.of(2026, 1, 9, 11, 34);

        /*
         * =========================
         * OUTPUT
         * =========================
         */

        System.out.println("d01 = " + d01); // current date
        System.out.println("d02 = " + d02); // current date and time
        System.out.println("d03 = " + d03); // current instant (UTC)
        System.out.println("d04 = " + d04); // parsed ISO date
        System.out.println("d05 = " + d05); // parsed ISO date-time
        System.out.println("d06 = " + d06); // UTC instant
        System.out.println("d07 = " + d07); // instant with offset
        System.out.println("d08 = " + d08); // custom formatted date
        System.out.println("d09 = " + d09); // custom formatted date-time
        System.out.println("d10 = " + d10); // manually created date
        System.out.println("d11 = " + d11); // manually created date-time

        sc.close();
    }
}
