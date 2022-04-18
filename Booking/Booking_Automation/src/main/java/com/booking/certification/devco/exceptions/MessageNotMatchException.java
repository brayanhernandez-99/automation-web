package com.booking.certification.devco.exceptions;

public class MessageNotMatchException extends AssertionError {

    public MessageNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
