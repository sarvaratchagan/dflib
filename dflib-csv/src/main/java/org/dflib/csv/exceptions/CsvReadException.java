package org.dflib.csv.exceptions;

/**
 * Thrown when CSV content cannot be read.
 *
 * <p>This exception typically indicates an I/O-related failure while
 * accessing or reading CSV data, such as a missing resource, an
 * inaccessible file, a closed stream, or an unexpected read error.</p>
 */
public class CsvReadException extends CsvException {

    /**
     * Creates a new read exception with the specified detail message.
     *
     * @param message a description of the read failure
     */
    public CsvReadException(String message) {
        super(message);
    }

    /**
     * Creates a new read exception with the specified detail message and cause.
     *
     * @param message a description of the read failure
     * @param cause the underlying cause of the failure
     */
    public CsvReadException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new read exception with the specified cause.
     *
     * @param cause the underlying cause of the failure
     */
    public CsvReadException(Throwable cause) {
        super(cause);
    }
}
