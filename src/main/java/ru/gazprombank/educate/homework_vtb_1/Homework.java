package ru.gazprombank.educate.homework_vtb_1;

public class Homework {
    static int maxSumm = 0;


    public static void main(String[] args) {
        String[] strings = {"aaaaaaa", "bbbb", "cccc", "abab", "abcabc", "aaccaab", "aabaab"};
        maxSummCharInString(strings);
    }

    public static void maxSummCharInString(String[] strings){
        int summInCycle = 0;
        String maxString1 = "";
        String maxString2 = "";
        for(String c : strings){
            summInCycle = costString(c);

            if(summInCycle > maxSumm){
                maxSumm = summInCycle;
                maxString1 = c;
            }
            if(summInCycle == maxSumm){
                maxString2 = c;
            }


        }
        if(maxString1.length() > maxString2.length()){
            System.out.println(maxString2);
        } else if (maxString1.length() < maxString2.length()) {
            System.out.println(maxString1);
        }else{
            System.out.println(maxString1);
            System.out.println(maxString2);
        }

    }

    public static int costString(String str){
       //char[] strArray = str.toCharArray();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count += 3;
            }else if (str.charAt(i) == 'b') {
                count += 2;
            }else {
                count++;
            }
        }
        return count;
    }
}
