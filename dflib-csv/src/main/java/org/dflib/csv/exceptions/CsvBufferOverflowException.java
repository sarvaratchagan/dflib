package org.dflib.csv.exceptions;

/**
 * Thrown when the CSV parser buffer capacity is exceeded.
 */
public class CsvBufferOverflowException extends CsvParseException {

    /**
     * Creates a new exception with the specified message.
     *
     * @param message exception detail message
     */
    public CsvBufferOverflowException(String message) {
        super(message);
    }
}
