package ru.gazprombank.educate.homework8;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(birdsSinging(80,true));
    }

    public static boolean birdsSinging (int temp, boolean isSummer)
    {
        int tempMin=60;
        int tempMax=90;
        boolean song = false;

        if (isSummer){
            tempMax=100;
        }
        if((temp<=tempMax)&&(temp>=tempMin)){
            song = true;
        }
        return song;
    }
}
