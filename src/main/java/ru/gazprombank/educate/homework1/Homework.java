package ru.gazprombank.educate.homework1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);
       // String str = s.nextLine();

        //punctuationCount(str);
    }

        public static int punctuationCount(String s1){
            String[] array = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-",
                    ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^",
                    "_", "`", "{", "|", "}", "~"};
            int count = 0;
            for(int i = 0; i < array.length; i++){
                if(s1.contains(array[i])){
                    count += 1;
                }
            }
            return count;
        }

        }

char[] chars = s1.toCharArray();
String[] myarray = new String[]{Arrays.toString(chars)};
int count = 0;
        for (int i = 0; i < myarray.length; i++){
        for(int j = 0; j < array.length; j++){
        if(myarray[i].equals(array[j])){
count += 1;
        }
        }
        }
        // return count;
        System.out.println(count);
        System.out.println(myarray);
    }




