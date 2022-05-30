package ru.gazprombank.educate.homework23;

public class Homework {

    public static void main(String[] args) {
        String str = "xyz[abc]123";



        }

        public static String insideBrackets(String str) {
            return str.substring(str.indexOf("["), str.indexOf("]") + 1);

        }

    }