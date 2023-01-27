package ru.gazprombank.educate.homework19;

import java.util.ArrayList;

public class Homework {
    public static int longestStreak(String str) {

        if (str.length() < 2) {
            return str.length();
        }

        int ravenlast = 1;
        int maxgroup=0;

        for (int i = 1; i < str.length(); i++) {
         if (str.charAt(i)==str.charAt(i-1) && maxgroup ==0){
             ravenlast=ravenlast+1;

         }
         else if (str.charAt(i)!=str.charAt(i-1) && maxgroup ==0){
             maxgroup=ravenlast;
             ravenlast=1;
         }
         else if (str.charAt(i)==str.charAt(i-1) && maxgroup !=0){
                ravenlast=ravenlast+1;
            }
         else if (str.charAt(i)!=str.charAt(i-1) && maxgroup !=0){
             if (ravenlast > maxgroup) {
                 maxgroup = ravenlast;
                 ravenlast = 1;
             } else {
                 ravenlast = 1;
             }

         }

        }

return (ravenlast > maxgroup? ravenlast : maxgroup);

    }

    public static void main(String[] args) {

        longestStreak("xyzz");
    }
}
