package org.dflib.csv.exceptions;

/**
 * Thrown when CSV content is malformed or cannot be parsed.
 */
public class CsvParseException extends CsvException {

    /**
     * Creates a new exception with the specified message.
     *
     * @param message exception detail message
     */
    public CsvParseException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with the specified message and cause.
     *
     * @param message exception detail message
     * @param cause root cause of the failure
     */
    public CsvParseException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new exception with the specified cause.
     *
     * @param cause root cause of the failure
     */
    public CsvParseException(Throwable cause) {
        super(cause);
    }
}
