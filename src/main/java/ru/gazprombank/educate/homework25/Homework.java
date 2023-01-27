package ru.gazprombank.educate.homework25;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Homework {

    public static String getPrefix(String[] strings) {

        String emptyarray = "";
        ArrayList commonchars = new ArrayList<Character>();

        int minlength = strings[0].length();

        int yo = 0;


        for (int slova = 0; slova < strings.length; slova++) {
            int tempsmolest = strings[slova].length();
            if (tempsmolest <= minlength) {
                yo = tempsmolest;
            }
        }

        minlength = yo;

        for (int bukvafirst = 0; bukvafirst < minlength; bukvafirst++) {

            for (int slovo = 0; slovo < strings.length - 1; slovo++) {

                if (strings[slovo].charAt(bukvafirst) != strings[slovo + 1].charAt(bukvafirst)) {
                    return emptyarray;
                }
                else if (strings[slovo].charAt(bukvafirst) == strings[slovo + 1].charAt(bukvafirst) && slovo == strings.length - 2) {
                    commonchars.add(strings[slovo].charAt(bukvafirst));
                }


            }

        }


        return (String) (commonchars.stream().map(e -> e.toString()).collect(Collectors.joining()));
    }

    public static void main(String[] args) {


    }
}