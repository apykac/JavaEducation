package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        int count = Homework.punctuationCount("sdhjfghjsf,sdf.sdfsd!!!");
        System.out.println(count);

    }

    public static int punctuationCount(String a){
        int c = 0;
        char[] znakiprep = {'.',',',';',':','!','?','-','"','@','#','%','^','&','*','$','\'','[',']','+','/','<','>','(',')','_','`','{','}','~','=','|','\\' };
        for (int i = 0 ; i<=a.length()-1; i++){
            for (int j = 0 ; j <= znakiprep.length-1;j++){
                if (a.charAt(i) == znakiprep[j]){
                    c++;
                }
            }
         }
        return c;
    }
}
