package org.dflib.csv.exceptions;

/**
 * Thrown when CSV content cannot be written.
 */
public class CsvWriteException extends CsvException {

    /**
     * Creates a new exception with the specified message.
     *
     * @param message exception detail message
     */
    public CsvWriteException(String message) {
        super(message);
    }

    /**
     * Creates a new exception with the specified message and cause.
     *
     * @param message exception detail message
     * @param cause root cause of the failure
     */
    public CsvWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
