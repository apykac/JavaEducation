package ru.gazprombank.educate.homework1;

public class Homework {

    public static int punctuationCount(String anyString) {

        int count = 0;
        for (int i = 0; i < anyString.length() - 1; i++) {
            if (anyString.charAt(i) == ',' || anyString.charAt(i) == ';' || anyString.charAt(i) == '.' ||
                    anyString.charAt(i) == '!' || anyString.charAt(i) == ':' || anyString.charAt(i) == '?' ||
                    anyString.charAt(i) == '(' || anyString.charAt(i) == ')' || anyString.charAt(i) == '-' ||
                    anyString.charAt(i) == '<' || anyString.charAt(i) == '>' || anyString.charAt(i) == '#' ||
                    anyString.charAt(i) == '$' || anyString.charAt(i) == '%' || anyString.charAt(i) == '&' ||
                    anyString.charAt(i) == '*' || anyString.charAt(i) == '+' || anyString.charAt(i) == '/' ||
                    anyString.charAt(i) == '=' || anyString.charAt(i) == '@' || anyString.charAt(i) == '[' ||
                    anyString.charAt(i) == ']' || anyString.charAt(i) == '\\' || anyString.charAt(i) == '^' ||
                    anyString.charAt(i) == '_' || anyString.charAt(i) == '|' || anyString.charAt(i) == '~' ||
                    anyString.charAt(i) == '`' || anyString.charAt(i) == '\"' || anyString.charAt(i) == '\'' ||
                    anyString.charAt(i) == '{' || anyString.charAt(i) == '}'
            )
                count++;
        }

        return (count);
    }

    public static void main(String[] args) {

    }
}