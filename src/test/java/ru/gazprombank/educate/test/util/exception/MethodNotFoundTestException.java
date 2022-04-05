package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class MethodNotFoundTestException extends RuntimeException {
    private static final long serialVersionUID = 3591199269941558318L;

    public MethodNotFoundTestException(String methodName,
                                       TestClass returnedTypeClass,
                                       List<Modifier> modifiers,
                                       List<TestClass> parameterTypeClasses) {
        super(buildMessage(methodName, returnedTypeClass, modifiers, parameterTypeClasses));
    }

    private static String buildMessage(String methodName,
                                       TestClass returnedTypeClass,
                                       List<Modifier> modifiers,
                                       List<TestClass> parameterTypeClasses) {
        StringBuilder builder = new StringBuilder();
        builder.append("method '").append(returnedTypeClass);
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        builder.append(' ').append(methodName).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameterTypeClasses, ", ");
        builder.append(")' not found");
        return builder.toString();
    }
}
