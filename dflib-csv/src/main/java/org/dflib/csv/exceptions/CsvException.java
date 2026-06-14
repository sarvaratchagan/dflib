package org.dflib.csv.exceptions;

/**
 * Base exception for all CSV-related failures.
 */
public class CsvException extends RuntimeException {

    /**
     * Creates a new exception with the specified message.
     *
     * @param message exception detail message
     */
    public CsvException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with the specified message and cause.
     *
     * @param message exception detail message
     * @param cause root cause of the failure
     */
    public CsvException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new exception with the specified cause.
     *
     * @param cause root cause of the failure
     */
    public CsvException(Throwable cause) {
        super(cause);
    }
}
