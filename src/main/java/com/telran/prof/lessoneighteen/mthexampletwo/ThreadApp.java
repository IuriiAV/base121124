package com.telran.prof.lessoneighteen.mthexampletwo;

public class ThreadApp {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();

        new Thread(threadExample).start();
    }
}
