package com.telran.prof.lessoons.lesson22;

public class TestApp {

    public static void main(String[] args) {
        TestString testOne = new TestString("Hello");
        String objOne = testOne.getObj();

        TestInteger testTwo = new TestInteger(4);
        Integer objTwo = testTwo.getObj();

        TestObject testThree = new TestObject(true);
        boolean objThree = (boolean) testThree.getObj();

        Test<String> testFour = new Test<>("Hello");
        String objFour = testFour.getObj();

        Test<Double> testFive = new Test<>(496.456);
        Double objFive = testFive.getObj();

        TestTwo<Boolean> testSix = new TestTwo<>(true, "it is a test");

        TestThree<String, Double> testSeven = new TestThree<>("Hello", 78.89, 89);

        printElementType(5);
        printElementType("Hello");
        printElementType(true);
        printElementType(78.54);

    }

    public static <T> void printElementType(T element) {
        System.out.println(element.getClass().getName() + " element");
    }
}
