package ru.gazprombank.educate.homework23;

public class Homework {

    public static void main(String[] args) {
        System.out.println(insideBrackets("xyz[abc]123"));
    }
    public static String insideBrackets(String str){
        return str.substring(str.indexOf("["), str.indexOf("]") + 1);
    }
}
