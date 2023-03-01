package duke.parser.datetime;

import duke.exceptions.InvalidDateTimeException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Helper class for parsing LocalDateTime object
 */
public class DateTimeParser {
    private static final String FORMAT = "yyyy-MM-dd HHmm";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMAT);

    /**
     * Convert the user input date into LocalDateTime object.
     *
     * @param input String to be processed
     * @return LocalDateTime object corresponding to the input
     * @throws InvalidDateTimeException If input string does not match the required format
     */
    public static LocalDateTime parse(String input) throws InvalidDateTimeException {
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(input.trim(), FORMATTER);
        } catch (DateTimeParseException e) {
            throw new InvalidDateTimeException();
        }

        return dateTime;
    }

    public static String getFormat() {
        return FORMAT;
    }

    public static DateTimeFormatter getFormatter() {
        return FORMATTER;
    }
}