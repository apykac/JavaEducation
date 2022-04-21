package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        String line = String.valueOf(punctuationCount("Проверка-на количество, # знаков @ препинания!"));
        System.out.println(line);
    }

    public static int punctuationCount(String line) {
        char[] znaki = {'.', ',', '-', ':', ';', '?', '!', '"', '/', '%', '&', ')', '(', '*', '+', '<', '=', '@', '#', '^', '_', '"', '{', '}', '|', '~', '$', '>', '[', ']'};
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < znaki.length; j++) {
                if (line.charAt(i) == znaki[j]) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}

