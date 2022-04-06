package ru.gazprombank.educate.homework1;


public class HomeWork {
    public static void main(String[] args) {
    }


    public static int punctuationCount(String text) {
        text = text.replace("\\", ",");
        text = text.replace("'", ",");
        char[]c={'.',',','-',':',';','?','!','"','/','%','&',')','(','*','+','<','=','@','#','^','_','`','{','}','|','~','$','>','[',']'};
        int count = 0;
        for (int i=0;i<text.length();i++) {
            for (char value : c) {
                if (text.charAt(i) == value) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}