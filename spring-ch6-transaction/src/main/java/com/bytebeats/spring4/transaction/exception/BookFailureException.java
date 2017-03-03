package com.bytebeats.spring4.transaction.exception;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-03-03 11:20
 */
public class BookFailureException extends Exception {

    public BookFailureException() {
    }

    public BookFailureException(String message) {
        super(message);
    }

    public BookFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookFailureException(Throwable cause) {
        super(cause);
    }
}
