package ru.gazprombank.educate.homework1;

import java.util.Collections;
import java.util.HashSet;

public class Homework {
    public static void main(String[] args) {

    }

    public static int punctuationCount (String s) {
        s = s.replace("'",",");

        HashSet <Character> ch = new HashSet<>();
        ch.add(',');
        ch.add('.');
        ch.add(':');
        ch.add(';');
        ch.add('!');
        ch.add('?');
        ch.add('"');
        ch.add('#');
        ch.add('$');
        ch.add('&');
        ch.add('(');
        ch.add(')');
        ch.add('+');
        ch.add('-');
        ch.add('/');
        ch.add('>');
        ch.add('<');
        ch.add('=');
        ch.add('@');
        ch.add('[');
        ch.add(']');
        ch.add('^');
        ch.add('_');
        ch.add('`');
        ch.add('{');
        ch.add('}');
        ch.add('|');
        ch.add('~');
        ch.add('%');
        ch.add('*');
        ch.add('\\');

        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (ch.contains(s.charAt(i)))
                count++;
        }
        return count;
    }
}
