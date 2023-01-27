package ru.gazprombank.educate.homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Homework {

    public static String repeatChar(String str) {

        char[] abc = str.toCharArray();
        ArrayList arlist1 = new ArrayList<String>();

        for (int i = 0; i < abc.length; i++) {
            arlist1.add(abc[i]);
            arlist1.add(abc[i]);

        }
        return (String)(arlist1.stream().map(e->e.toString()).collect(Collectors.joining()));
        //return arlist1.toString().replace(",", "").replace(" ", "").replace("[", "").replace("]", "");


    }


    public static void main(String[] args) {

    }
}
