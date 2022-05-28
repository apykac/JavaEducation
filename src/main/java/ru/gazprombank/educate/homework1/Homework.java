package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Number of punctuation marks per line " + punctuationCount("hdfhgfdg,dfgfdgfdg,dfg"));
    }

    public static int punctuationCount(String st) {
//        создаем массив с символами пунктуации
        char[] c = {'$', '%', '&', '\'', '(', ')', '*', '+', '/', '<', '"', '>', '@', '[', '\\', ']', '^', '_', '`', '{',
                '~', '|', '}', '!', '#', '=', ',', '-', '.', '-', ';', ':', '?'};
        int count = 0;
//        цикл который будет итерироваться количество раз равное длине строки
        for (int i = 0; i < st.length(); i++) {
//            цикл в котором объявляем переменную "value", в котороую будет подставляться каждое значение из массива с
            for (char value : c) {
//                проверяем если символ из введенной строки по индексу i равен символу из массива, счетчик увеличиваем
                if (st.charAt(i) == value) {
                    count++;
                    break;
                }
            }
        }
        return (count);
    }
}
