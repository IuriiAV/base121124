package com.telran.base.lesson10;

public class Task {

    public static void main(String[] args) {
        String text = "Hello Java";
        System.out.println(change(text));
    }

    //HEAP : #FFEE00 : new StringBuilder // + temp
    // #FFHHEE : new StringBuilder

    private static String change(String text) {
        StringBuilder sbOne = new StringBuilder(); //#FFEE00
        StringBuilder sbTwo = new StringBuilder(); //#FFHHEE

        StringBuilder current = sbOne; //#FFEE00

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (temp == ' ') {
                current = sbTwo; //#FFHHEE
                continue;
            }
            current.append(temp);
        }

        return sbTwo.append(" ").toString() + sbOne.toString();
    }
}
