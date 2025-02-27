package com.telran.prof.lessonelleven.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryApp {

    public static void main(String[] args) {
        Map<String ,String> dictionaryRE = new HashMap<>();
        dictionaryRE.put("Привет" , "Helloy");

        Map<String,String> dictionaryED = new HashMap<>();
        dictionaryED.put("Helloy" , "Hallo");

        Map<String,String> dictionarySR = new HashMap<>();
        dictionarySR.put("Hola" , "Привет");

        Map<String , Map<String , String>> dictionary = new HashMap<>();
        dictionary.put("RUS" , dictionaryRE);
        dictionary.put("EN" , dictionaryED);
        dictionary.put("ES" , dictionarySR);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a language");
        String language = scanner.nextLine();
        Map<String, String> dic = dictionary.getOrDefault(language, dictionaryRE);

        System.out.println("Input word");
        String word = scanner.nextLine();
        String translate = dic.getOrDefault(word, word);

        System.out.println(translate);

    }
}
