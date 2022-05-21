package ru.gazprombank.educate.homework16;

public class Homework {
    public static String starKill(String anyString) {

        String newStr = null;
        int indexStar = anyString.indexOf("*");
        if (anyString.equals("*")) {
            anyString = anyString.replace("*", "");
            return anyString;
        }
        if (indexStar == -1) {
            return anyString;
        } else if (anyString.startsWith("*")) {
            newStr = anyString.substring(indexStar + 2);
            newStr = starKill(newStr);

        } else if (anyString.endsWith("*")) {
            newStr = anyString.substring(0, indexStar - 1);
            newStr = starKill(newStr);
        } else if (anyString.contains("**")) {
            newStr = anyString.substring(0, anyString.indexOf("*")) + anyString.substring(anyString.indexOf("*") + 1);
            newStr = starKill(newStr);
        } else if (anyString.contains("***")) {
            newStr = anyString.substring(0, anyString.indexOf("*")) + anyString.substring(anyString.indexOf("*") + 2);
            newStr = starKill(newStr);
        } else {

            for (int i = 0; i < anyString.length() - 1; i++) {
                newStr = anyString.substring(0, anyString.indexOf("*") - 1) + anyString.substring(anyString.indexOf("*") + 2);
                newStr = starKill(newStr);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {

    }
}