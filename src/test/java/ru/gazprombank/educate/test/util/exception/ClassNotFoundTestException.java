package ru.gazprombank.educate.test.util.exception;

public class ClassNotFoundTestException extends RuntimeException {
    private static final long serialVersionUID = 3591199269941558318L;

    public ClassNotFoundTestException(String name) {
        super("class '" + name + "' not found");
    }
}
