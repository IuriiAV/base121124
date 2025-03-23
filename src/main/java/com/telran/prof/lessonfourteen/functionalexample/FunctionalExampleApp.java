package com.telran.prof.lessonfourteen.functionalexample;

/**
 * @Functional interface - интерфейс только с одним абстрактным методом
 *
 * Синтаксис лямбда выражения:
 * Выражение делится на две части: левая часть с параметрами -> правая часть с кодом из метода
 * void calculate() : () -> System.out.println(5 + 10)
 * void calculate(int a) : (value) -> System.out.println(value + 10);
 * int calculate() : () -> 15 + 20;
 * int calculate(int b) : (b) -> b + 20;
 * int calculateAge(Student student) : (student) -> {
 *                                          if("Alex".equals(student.getName())) {
 *                                               return student.getAge();
 *                                          }
 *                                          return 0;
 *                                          }   ;
 *
 * В функциональном интерфейсе может быть сколько угодно статических или дефолтных методов!!!
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

        Calculator calculatorTwo = () -> System.out.println(5 + 10);
        calculatorTwo.calculate();

        CalculatorTwo calculatorWithParam = new CalculatorTwo() {
            @Override
            public void calculate(int a) {
                System.out.println(a + 10);
            }
        };
        calculatorWithParam.calculate(6);

        CalculatorTwo calculatorWithParamAsLambda = (value) -> System.out.println(value + 10);
        calculatorWithParamAsLambda.calculate(7);

        CalculatorThree calculatorThree = new CalculatorThree() {
            @Override
            public int calculate() {
                return 15 + 20;
            }
        };
        int calculator = calculatorThree.calculate();
        System.out.println(calculator);

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

        CalculatorTwo one = (a) -> System.out.println(a + 15);
        one.calculate(10);

        CalculatorTwo two = (a) -> System.out.println(a + 35);
        two.calculate(20);

        printResult(two,10);
        printResult(one, 5);
    }

    public static void printResult(CalculatorTwo calculator, int a) {
        calculator.calculate(a);
    }
}
