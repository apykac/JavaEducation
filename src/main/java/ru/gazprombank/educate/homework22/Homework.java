package ru.gazprombank.educate.homework22;

public class Homework {

    public static String hyphenSplit(String str) {
        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
        if(str.charAt(0) == str.charAt(1))
            return str.substring(0, 1) + "-" + hyphenSplit(str.substring(1));

        return str;
    }

    public static int yoYo(String str){
        if (str.contains("yo")){
            str = str.substring(str.indexOf("yo") + 2);
            return yoYo(str) +1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(hyphenSplit("xxdd"));
    }
}
