package com.telran.prof.lessontwentytwo;

public class TestApp {

    public static void main(String[] args) {
        TestString testOne = new TestString("Hello");
        String objOne = testOne.getObj();

        TestInteger testTwo = new TestInteger(5);
        Integer objTwo = testTwo.getObj();

        TestObj testThree = new TestObj(true);
        boolean objThree = (boolean) testThree.getObj();

        Test<String> testFour = new Test<>("Hello");
        String objFour = testFour.getObj();

        Test<Double> testFive = new Test<>(5555.35);
        Double objFive = testFive.getObj();

        TestTwo<Boolean> testSix = new TestTwo<>(true, "it is a test");

        TestThree<String, Double> testSeven = new TestThree<>("Hello", 55.55, 10);

        printElementType(5);
        printElementType("Hello");
        printElementType(true);
        printElementType(66.55);
        printElementType(new String[]{"44"});
    }

    public static <T> void printElementType(T element) {
        System.out.println(element.getClass().getName() + " element");
    }
}
