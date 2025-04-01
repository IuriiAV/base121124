package com.telran.prof.lessontwentyfour;

import java.util.regex.Pattern;

public class PracticeTask {

    public static void main(String[] args) {
        //1234567
        //123 4567
        //123-4567

        //написать метод валидации
        //на этот метод написать параметризирвоанный тест для 3 типов
        //и тест для некорректного номера
        String regex = "\\d{3}[\\s-]?\\d{4}";
    }

    public boolean isValidNumber(String phoneNumber) {
        String regex = "\\d{3}[\\s-]?\\d{4}";
        return Pattern.matches(regex,phoneNumber);
    }
}
