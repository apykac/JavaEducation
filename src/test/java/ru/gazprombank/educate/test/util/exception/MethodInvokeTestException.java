package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class MethodInvokeTestException extends RuntimeException {
    private static final long serialVersionUID = 472515426824261190L;

    public MethodInvokeTestException(TestClass owner,
                                     String methodName,
                                     TestClass returnedTypeClass,
                                     List<Modifier> modifiers,
                                     List<TestClass> parameterTypeClasses) {
        super(buildMessage(owner, methodName, returnedTypeClass, modifiers, parameterTypeClasses, null));
    }

    public MethodInvokeTestException(TestClass owner,
                                     String methodName,
                                     TestClass returnedTypeClass,
                                     List<Modifier> modifiers,
                                     List<TestClass> parameterTypeClasses,
                                     String message) {
        super(buildMessage(owner, methodName, returnedTypeClass, modifiers, parameterTypeClasses, message));
    }

    public MethodInvokeTestException(TestClass owner,
                                     String methodName,
                                     TestClass returnedTypeClass,
                                     List<Modifier> modifiers,
                                     List<TestClass> parameterTypeClasses,
                                     Throwable cause) {
        super(buildMessage(owner, methodName, returnedTypeClass, modifiers, parameterTypeClasses, null), cause);
    }

    public MethodInvokeTestException(TestClass owner,
                                     String methodName,
                                     TestClass returnedTypeClass,
                                     List<Modifier> modifiers,
                                     List<TestClass> parameterTypeClasses,
                                     String message,
                                     Throwable cause) {
        super(buildMessage(owner, methodName, returnedTypeClass, modifiers, parameterTypeClasses, message), cause);
    }

    private static String buildMessage(TestClass owner,
                                       String methodName,
                                       TestClass returnedTypeClass,
                                       List<Modifier> modifiers,
                                       List<TestClass> parameterTypeClasses,
                                       String message) {
        StringBuilder builder = new StringBuilder();
        builder.append("method '");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        if (modifiers != null && !modifiers.isEmpty()) {
            builder.append(' ');
        }
        builder.append(returnedTypeClass).append(' ').append(owner.getSimpleName()).append('.').append(methodName).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameterTypeClasses, ", ");
        builder.append(")' invoke exception");
        if (message != null) {
            builder.append(": ").append(message);
        }
        return builder.toString();
    }
}
