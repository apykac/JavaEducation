package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {

    }
    public static int punctuationCount(String a){
        char[]c={'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
                '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
                '_', '`', '{', '|', '}', '~'};
        int count = 0;
        char[]ch = a.toCharArray();
        for(int i=0;i<ch.length;i++) {
            for (int j = 0; j < c.length; j++) {
                if (ch[i] == c[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
