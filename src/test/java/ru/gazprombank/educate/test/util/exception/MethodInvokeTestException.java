package ru.gazprombank.educate.test.util.exception;

public class MethodInvokeTestException extends RuntimeException{
    public MethodInvokeTestException() {
    }

    public MethodInvokeTestException(String message) {
        super(message);
    }

    public MethodInvokeTestException(String message, Throwable cause) {
        super(message, cause);
    }

    public MethodInvokeTestException(Throwable cause) {
        super(cause);
    }

    public MethodInvokeTestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
