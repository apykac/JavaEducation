package ru.gazprombank.educate.homework21;

public class Homework {

    public static void main(String[] args) {

    }

    public static int count = 0;
    public static String strN = "";
    public static String strO = "";

    public static String endoo (String str) {
        strN = str;
        if (!str.contains("o")) {
            strN = strN + strO;
            strO = "";
            return strN;
        }
        if (str.indexOf("o") == 0) {
            strN = str.substring(1);
        } else {
            strN = str.substring(0,str.indexOf("o"))  + str.substring(str.indexOf("o") + 1);
        }
        strO = strO + "o";
        return endoo(strN);
    }
}
