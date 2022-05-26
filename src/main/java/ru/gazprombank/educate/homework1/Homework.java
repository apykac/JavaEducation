package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        int count = Homework.punctuationCount("Hello, what is u name?!");
        System.out.println(count);
    }
    public static int punctuationCount(String a){
        char[]sign={'!', '?','.', ',' ,':', ';', '/','(', ')', '"','#', '$', '%','&', '\'','*','+', '-','<','=', '>','@','[',']','\\', '`', '_','{','}','~', '|','^'};
        int count = 0;
        char[]sign1 = a.toCharArray();
        for(int i=0;i<sign1.length;i++) {
            for (int j = 0; j < sign.length; j++) {
                if (sign1[i] == sign[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
