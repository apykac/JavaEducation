package ru.gazprombank.educate.homework22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {

    public static String hyphenSplit(String str) {

        Pattern p = Pattern.compile("(?<seq1>.)(?<seq2>\\1+?)");
        Matcher m = p.matcher(str);
        if (m.find() == false) {
            return str;
        }


        return hyphenSplit(m.replaceFirst("${seq1}-${seq2}"));
    }

    public static void main(String[] args) {

        hyphenSplit("asdasdjjjasdasdkk");
    }
}
