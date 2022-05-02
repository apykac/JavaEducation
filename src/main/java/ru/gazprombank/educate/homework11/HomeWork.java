package ru.gazprombank.educate.homework11;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(fizzyWizzy(15));
    }
    public static String fizzyWizzy (int n) {
        String text ="";
        int module3 = n % 3;
        int module5 = n % 5;
        if (module3 == 0)
            text = "Fizz!";
        if (module5 == 0)
            text = "Buzz!";
        if ((module3 == 0) & (module5 == 0))
            text = "FizzBuzz!";
        if ((module3 != 0) && (module5 != 0))
            text = n + "!";
        return text;
    }
}
