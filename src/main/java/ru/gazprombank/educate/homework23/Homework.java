package ru.gazprombank.educate.homework23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {

    public static void main(String[] args) {

    }

    public static String insideBrackets(String str){
        Pattern pattern = Pattern.compile("\\[.*]");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            return matcher.group();
        } else {
            return str;
        }

    }
}
