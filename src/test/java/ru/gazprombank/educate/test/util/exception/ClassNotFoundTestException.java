package ru.gazprombank.educate.test.util.exception;

public class ClassNotFoundTestException extends RuntimeException {
    private static final long serialVersionUID = 8788614931140491860L;

    public ClassNotFoundTestException(String name) {
        super("class '" + name + "' not found");
    }
}
