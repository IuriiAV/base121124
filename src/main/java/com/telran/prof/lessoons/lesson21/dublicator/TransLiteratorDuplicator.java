package com.telran.prof.lessoons.lesson21.dublicator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransLiteratorDuplicator implements Duplicator {

    Map<Character, Character> characterMap = new HashMap<>();

    public TransLiteratorDuplicator() {
        init();
    }

    private void init() {
        characterMap.put('a', 'а');
        characterMap.put('b', 'б');
        characterMap.put('c', 'к');
        characterMap.put('d', 'д');
        characterMap.put('e', 'е');
        characterMap.put('f', 'ф');
        characterMap.put('g', 'г');
        characterMap.put('h', 'х');
        characterMap.put('i', 'и');
        characterMap.put('j', 'й');
        characterMap.put('k', 'к');
        characterMap.put('l', 'л');
        characterMap.put('m', 'м');
        characterMap.put('n', 'н');
        characterMap.put('o', 'о');
        characterMap.put('p', 'п');
        characterMap.put('q', 'к');
        characterMap.put('r', 'р');
        characterMap.put('s', 'с');
        characterMap.put('t', 'т');
        characterMap.put('u', 'у');
        characterMap.put('v', 'в');
        characterMap.put('w', 'в');
        characterMap.put('x', 'х');
        characterMap.put('y', 'ы');
        characterMap.put('z', 'з');
        characterMap.put('A', 'А');
        characterMap.put('B', 'Б');
        characterMap.put('C', 'К');
        characterMap.put('D', 'Д');
        characterMap.put('E', 'Е');
        characterMap.put('F', 'Ф');
        characterMap.put('G', 'Г');
        characterMap.put('H', 'Х');
        characterMap.put('I', 'И');
        characterMap.put('J', 'Й');
        characterMap.put('K', 'К');
        characterMap.put('L', 'Л');
        characterMap.put('M', 'М');
        characterMap.put('N', 'Н');
        characterMap.put('O', 'О');
        characterMap.put('P', 'П');
        characterMap.put('Q', 'К');
        characterMap.put('R', 'Р');
        characterMap.put('S', 'С');
        characterMap.put('T', 'Т');
        characterMap.put('U', 'У');
        characterMap.put('V', 'В');
        characterMap.put('W', 'В');
        characterMap.put('X', 'Х');
        characterMap.put('Y', 'Ы');
        characterMap.put('Z', 'З');
    }

    @Override
    public void duplicate(String from, String to) {
        try {
            FileInputStream fileInputStream = new FileInputStream(from);
            FileOutputStream fileOutputStream = new FileOutputStream(to);
            int read;
            while (fileInputStream.available() > 0) {
                read = fileInputStream.read();
                char ch = (char) read;
                if (characterMap.containsKey(ch) && Character.isLetter(ch)) {
                    byte[] byteUTF8 = String.valueOf(characterMap.get(ch)).getBytes();
                    fileOutputStream.write(byteUTF8);
                } else {
                    fileOutputStream.write(read);
                }
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println("Cannot copy file from " + from + "\n to " + to);
        }
    }
}
