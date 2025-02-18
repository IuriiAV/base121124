package com.telran.prof.lessoneleven.dictionary;

import java.util.*;

public class DictionaryApp {

    public static void main(String[] args) {
        Map<String, String> dictionaryRE = new HashMap<>();
        dictionaryRE.put("Привет", "Hello");

        Map<String, String> dictionaryED = new HashMap<>();
        dictionaryED.put("Hello", "Hallo");

        Map<String, String> dictionarySR = new HashMap<>();
        dictionarySR.put("Hola", "Привет");

        Map<String, Map<String, String>> dictionaries = new HashMap<>();
        dictionaries.put("RUS", dictionaryRE);
        dictionaries.put("EN", dictionaryED);
        dictionaries.put("ES", dictionarySR);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose language : RUS, EN, ES");
        String language = scanner.next();
        Map<String, String> dic = dictionaries.getOrDefault(language, dictionaryRE);

        System.out.println("Input word :");
        String word = scanner.next();
        String translate = dic.getOrDefault(word, word);

        System.out.println(translate);
        // key -> value (key - value)
        // ES -> (original -> translated)

        //HashMap
        //key-value
        //apple - 10
        //lemon - 15

        //HashSet
        //key    (value)
        //apple - PRESENT
        //lemon - PRESENT
        Set<String> set = new HashSet<>();

        Set<String> stringSet = new TreeSet<>();

    }
}
