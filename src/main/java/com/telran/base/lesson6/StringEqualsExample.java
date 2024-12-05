package com.telran.base.lesson6;

/**
 * Строки друг с другом сравниваются через метод equals
 * посимвольно на эквивалентность
 *
 * При сравнении строк equals всегда нужно вызвать у
 * точно известного значения, иначе есть риск NPE
 */
public class StringEqualsExample {

    public static void main(String[] args) {
        System.out.println("Say something : ");
        String userWord = null;
        boolean equalsHello = isEqualsHello(userWord);
        if (equalsHello) {
            System.out.println("Hi User");
        }
    }

    private static boolean isEqualsHello(String value) {
        //null.equals("Hello") - NPE
        //"Hello".equals(null)  - false
        if ("Hello".equals(value)) {
            return true;
        }

        return false;
    }
}
