package com.telran.prof.lessonfourteen;

import java.util.List;

/**
 * Interface -> Implementation(class) -> use this implementation
 *
 * Interface -> use this implementation as anonymous class
 */
public class PrinterApp {

    public static void main(String[] args) {
        //1 Standard
        PrinterImpl printer = new PrinterImpl();
        printer.print();

        //2 As anonymous
        Printer printerAsAnonymous = new Printer() {
            @Override
            public void print() {
                System.out.println("Hello from anonymous");
            }
        };
        printerAsAnonymous.print();

        //3 As lambda    -> lambda
        Printer printerAsLambda = () -> System.out.println("Hello from lambda");
        printerAsLambda.print();
    }
}
