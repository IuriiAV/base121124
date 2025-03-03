package com.telran.prof.lessoons.lesson14.functionalexample;

/**
 * @Functional Interface - интерфейс только с одним абстрактным методом
 *
 * Синтаксис лямбда выражения:
 * Выражение делится на две части: левая часть с параметрами -> правая часть с кодом из метода
 * void calculate() : () -> System.out.println(5 + 10);
 */

public class FunctionalExampleApp {

    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator() {
            @Override
            public void calculate() {
                System.out.println(5 + 10);
            }
        };
        calculatorOne.calculate();

        Calculator calculatorTwo = () ->  System.out.println(5 + 10);
        calculatorTwo.calculate();

        CalculatorTwo calculatorTwoWithParam = new CalculatorTwo() {
            @Override
            public void calculate(int a) {
                System.out.println(a + 10);
            }
        };

        calculatorTwoWithParam.calculate(8);

        CalculatorTwo calculatorTwoWithParamAsLambda = (value) -> System.out.println(value + 10);
        calculatorTwoWithParamAsLambda.calculate(7);

        CalculatorThree calculatorThree = new CalculatorThree() {
            @Override
            public int calculate() {
                return 45 + 67;
            }
        };

        int calculate = calculatorThree.calculate();
        System.out.println(calculate);

        CalculatorThree calculatorThreeAsLambda = () -> 67 + 78;
        System.out.println(calculatorThreeAsLambda.calculate());

        StudentCalculator studentCalculator = new StudentCalculator() {
            @Override
            public int calculateAge(Student student) {
                if("Alex".equals(student.getName())) {
                    return student.getAge();
                }
                return 0;
            }
        };

        StudentCalculator stCalculator = (student) -> {
            if("Alex".equals(student.getName())) {
                return student.getAge();
            }
            return 0;
        };
    }

    public static void printResult(CalculatorTwo calculator, int a){
        calculator.calculate(a);
    }
}
