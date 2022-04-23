package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {

    }
    public static String middleThree (String s) {
        int len = s.length();
        if (len < 3) return s;
        int start = len/2;
        char [] ch = new char[3];
        s.getChars(start-1, start+2, ch, 0);
        String s1 = "" + ch[0] + ch[1] + ch[2];
    return s1;
    }
}
