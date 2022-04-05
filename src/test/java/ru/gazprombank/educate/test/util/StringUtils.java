package ru.gazprombank.educate.test.util;

import java.util.List;

public final class StringUtils {
    private StringUtils() {
        throw new UnsupportedOperationException();
    }

    public static <T> void fillBuilderWithJoin(StringBuilder builder, List<T> list, String splitter) {
        if (builder != null && !list.isEmpty()) {
            splitter = splitter == null ? "" : splitter;
            boolean begin = true;
            for (T element : list) {
                if (begin) {
                    builder.append(element);
                    begin = false;
                } else {
                    builder.append(splitter).append(element);
                }
            }
        }
    }

    public static <T> String joinList(List<T> list, String splitter) {
        StringBuilder builder = new StringBuilder();
        fillBuilderWithJoin(builder, list, splitter);
        return builder.toString();
    }
}
