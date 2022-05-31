package ru.gazprombank.educate.homework1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {

        String input = Arrays.toString(args);

        System.out.println(punctuationCount(input));

    }

    public static int punctuationCount(String text) {

        int counter = 0;
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            counter++;
        }
        return counter;

    }

}