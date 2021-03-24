package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        String result ="";

        if (number % 3 == 0){
            result += words[0];
        }
        if (number % 7 == 0){
            result += words[1];
        }
        return result;
    }
}
