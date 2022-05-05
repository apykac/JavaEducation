package ru.gazprombank.educate.homework1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {

    }

    public static int punctuationCount (String s) {
        s = s.replace("'",",");

        // Можно сделать запись короче
        // Set<Character> ch = new HashSet<>(Arrays.asList(',', '.', ':' и т.д));

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
