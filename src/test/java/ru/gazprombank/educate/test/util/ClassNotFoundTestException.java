package ru.gazprombank.educate.test.util;

public class ClassNotFoundTestException extends RuntimeException {
    private static final long serialVersionUID = 3591199269941558318L;

    public ClassNotFoundTestException() {
    }

    public ClassNotFoundTestException(String message) {
        super(message);
    }

    public ClassNotFoundTestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassNotFoundTestException(Throwable cause) {
        super(cause);
    }

    public ClassNotFoundTestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
