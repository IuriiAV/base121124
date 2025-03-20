package com.telran.prof.lessontwentyone.duplicator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Доделать
 */
public class TransliteratorDuplicator implements Duplicator{

    Map<Character,Character> characterMap = new HashMap<>();

    public TransliteratorDuplicator() {
        init();
    }

    private void init() {
        characterMap.put('f','ф');
    }

    @Override
    public void duplicate(String from, String to) {
        // a - a
        // b - б
        // etc
        //
    }
}
