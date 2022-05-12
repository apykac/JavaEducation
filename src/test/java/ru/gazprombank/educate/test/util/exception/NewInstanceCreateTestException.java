package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class NewInstanceCreateTestException extends RuntimeException {
    private static final long serialVersionUID = -3183464521308166985L;

    public NewInstanceCreateTestException(TestClass ownerClass,
                                          List<Modifier> modifiers,
                                          List<TestClass> parameterTypeClasses) {
        super(buildMessage(ownerClass, modifiers, parameterTypeClasses, null));
    }

    public NewInstanceCreateTestException(TestClass ownerClass,
                                          List<Modifier> modifiers,
                                          List<TestClass> parameterTypeClasses,
                                          String message) {
        super(buildMessage(ownerClass, modifiers, parameterTypeClasses, message));
    }

    public NewInstanceCreateTestException(TestClass ownerClass,
                                          List<Modifier> modifiers,
                                          List<TestClass> parameterTypeClasses,
                                          Throwable cause) {
        super(buildMessage(ownerClass, modifiers, parameterTypeClasses, null), cause);
    }

    public NewInstanceCreateTestException(TestClass ownerClass,
                                          List<Modifier> modifiers,
                                          List<TestClass> parameterTypeClasses,
                                          String message,
                                          Throwable cause) {
        super(buildMessage(ownerClass, modifiers, parameterTypeClasses, message), cause);
    }

    private static String buildMessage(TestClass ownerClass,
                                       List<Modifier> modifiers,
                                       List<TestClass> parameterTypeClasses,
                                       String message) {
        StringBuilder builder = new StringBuilder();
        builder.append("constructor '");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        if (modifiers != null && !modifiers.isEmpty()) {
            builder.append(' ');
        }
        builder.append(ownerClass.getSimpleName()).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameterTypeClasses, " ");
        builder.append(")' new instance create exception");
        if (message != null) {
            builder.append(": ").append(message);
        }
        return builder.toString();
    }
}
