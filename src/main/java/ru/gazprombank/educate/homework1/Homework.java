package ru.gazprombank.educate.homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

    }

    public static int punctuationCount(String s1) {
        Character[] array = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
                '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
                '_', '`', '{', '|', '}', '~'};
        char[] chars = s1.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (chars[i] == array[j]) {
                    count += 1;
                }
            }

        }
        return count;
    }
}


