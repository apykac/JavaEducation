package ru.gazprombank.educate.test.util.exception;

import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.StringUtils;
import ru.gazprombank.educate.test.util.reflection.TestClass;

import java.util.List;

public class ConstructorNotFoundTestException extends RuntimeException {

    private static final long serialVersionUID = -4178185089705255329L;

    public ConstructorNotFoundTestException(TestClass ownerClass,
                                            List<Modifier> modifiers,
                                            List<TestClass> parameterTypeClasses) {
        super(buildMessage(ownerClass, modifiers, parameterTypeClasses));
    }

    private static String buildMessage(TestClass ownerClass,
                                       List<Modifier> modifiers,
                                       List<TestClass> parameterTypeClasses) {
        StringBuilder builder = new StringBuilder();
        builder.append("constructor '");
        StringUtils.fillBuilderWithJoin(builder, modifiers, " ");
        if (modifiers != null && !modifiers.isEmpty()) {
            builder.append(' ');
        }
        builder.append(ownerClass.getSimpleName()).append('(');
        StringUtils.fillBuilderWithJoin(builder, parameterTypeClasses, " ");
        builder.append(")' not found");
        return builder.toString();
    }
}
