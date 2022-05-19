package ru.gazprombank.educate.homework4;

public class Homework {
    public static void main(String[] args) {
        int[] array = new int[33];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 33) - 11);
            System.out.println(array[i]);
        }
    }
}