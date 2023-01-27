package ru.gazprombank.educate.homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework {

    public static int punctuationCount(String stroka) {

        String[] predefined_specsymbols = new String[]{"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-",
                ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "\\", "]", "^",
                "_", "`", "{", "|", "}", "~"};

        char[] cArray = stroka.toCharArray();

        String[] sa1 = String.valueOf(cArray).split("");

        ArrayList arlist1 = new ArrayList<String>();

        for (int i = 0; i < sa1.length; i++) {
            for (int j = 0; j < predefined_specsymbols.length; j++) {
                if (predefined_specsymbols[j].contains(sa1[i])) {

                    arlist1.add(sa1[i]);

                }
            }
        }

        return arlist1.size();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string:");

        String stroka = sc.nextLine();
        sc.close();


        punctuationCount(stroka);

    }

}








