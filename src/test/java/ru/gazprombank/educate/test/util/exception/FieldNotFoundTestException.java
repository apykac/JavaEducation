package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class FieldNotFoundTestException extends RuntimeException {
    private static final long serialVersionUID = 3591199269941558318L;

    public FieldNotFoundTestException(String fieldName,
                                      List<Modifier> modifiers,
                                      TestClass fieldType) {
        super(buildMessage(fieldName, modifiers, fieldType));
    }

    private static String buildMessage(String fieldName,
                                       List<Modifier> modifiers,
                                       TestClass fieldType) {
        StringBuilder builder = new StringBuilder();
        builder.append("field '");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(' ').append(methodName).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameterTypeClasses, ", ");
        builder.append(")' not found");
        return builder.toString();
    }
}
