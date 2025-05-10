package com.telran.prof.lessons.lesson11;


import java.util.*;

public class DictionaryApp {

    public static void main(String[] args) {
        Map<String, String> dictionaryRE = new HashMap<>();
        dictionaryRE.put("Привет", "Hello");

        Map<String, String> dictionaryED = new HashMap<>();
        dictionaryED.put("Hello", "Hallo");

        Map<String, String> dictionarySR = new HashMap<>();
        dictionaryED.put("Hola", "Привет");

        Map<String, Map<String, String>> dictionaries = new HashMap<>();
        dictionaries.put("RUS", dictionaryRE);
        dictionaries.put("EN", dictionaryED);
        dictionaries.put("ES", dictionarySR);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Place choose language : RUS, EN, ES");
        String language = scanner.next();
        Map<String, String> dic = dictionaries.getOrDefault(language, dictionaryRE);

        System.out.println("Input Word");
        String word = scanner.next();
        String translate = dic.getOrDefault(word, word);
        System.out.println(translate);

        //HashMap
        //key-value
        //apple - 20
        //lemon - 15

        //HashSet
        //key     (Value)
        //apple - PRESENT
        //lemon - PRESENT
    }
}
