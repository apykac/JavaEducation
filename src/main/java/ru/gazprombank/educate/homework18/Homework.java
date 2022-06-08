package ru.gazprombank.educate.homework18;

public class Homework {

    public static void main(String[] args) {

    }

    public static int matchingChar(String[] a, String[] b){
        int count = 0;
        int i = 0;

        for(String s : a){
            if (s.length() != 0){
                if (b[i].length() != 0){
                    if (s.substring(0, 1).equals(b[i].substring(0,1))){
                        count++;
                    }
                }
            }
            i++;
        }

        return count;
    }
}
