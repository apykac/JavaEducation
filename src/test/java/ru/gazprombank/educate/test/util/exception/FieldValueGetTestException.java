package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class FieldValueGetTestException extends RuntimeException {
    private static final long serialVersionUID = 70948696227607777L;

    public FieldValueGetTestException(TestClass owner,
                                      String fieldName,
                                      List<Modifier> modifiers,
                                      TestClass fieldType) {
        super(buildMessage(owner, fieldName, modifiers, fieldType, null));
    }

    public FieldValueGetTestException(TestClass owner,
                                      String fieldName,
                                      List<Modifier> modifiers,
                                      TestClass fieldType,
                                      String message) {
        super(buildMessage(owner, fieldName, modifiers, fieldType, message));
    }

    public FieldValueGetTestException(TestClass owner,
                                      String fieldName,
                                      List<Modifier> modifiers,
                                      TestClass fieldType,
                                      Throwable cause) {
        super(buildMessage(owner, fieldName, modifiers, fieldType, null), cause);
    }

    public FieldValueGetTestException(TestClass owner,
                                      String fieldName,
                                      List<Modifier> modifiers,
                                      TestClass fieldType,
                                      String message,
                                      Throwable cause) {
        super(buildMessage(owner, fieldName, modifiers, fieldType, message), cause);
    }

    private static String buildMessage(TestClass owner,
                                       String fieldName,
                                       List<Modifier> modifiers,
                                       TestClass fieldType,
                                       String message) {
        StringBuilder builder = new StringBuilder();
        builder.append("field '");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        if (modifiers != null && !modifiers.isEmpty()) {
            builder.append(' ');
        }
        builder.append(fieldType).append(' ').append(owner.getSimpleName()).append('.').append(fieldName).append("' value get exception");
        if (message != null) {
            builder.append(": ").append(message);
        }
        return builder.toString();
    }
}
