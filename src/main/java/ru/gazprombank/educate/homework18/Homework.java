package ru.gazprombank.educate.homework18;

import java.util.Objects;

public class Homework {

    public static void main(String[] args) {

    }

    public static int matchingChar (String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i ++) {
            // Строки сравниваются методом equals, т.к. операторы == и != сравнивают только ссылки строк, а тебе надо проверять содержимое строк
              if ((!a[i].equals("")) && (!b[i].equals(""))) {
                if (Objects.equals(a[i].charAt(0), b[i].charAt(0))) {
                    count++;
                }
            }
        }
        return count;
    }
}
