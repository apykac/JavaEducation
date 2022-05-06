package ru.gazprombank.educate.homework23;

public class Homework {

    public static void main(String[] args) {
        System.out.println(insideBrackets("HEL[abc]LO"));

    }

    public static String insideBrackets(String str) {
        return str.substring(str.indexOf("["), str.indexOf("]") + 1);

    }

}
