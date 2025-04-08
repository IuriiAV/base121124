package com.telran.prof.lessontwentysix.reflection;

public class ATM {

    private final String mainAccount;

    public ATM() {
        this.mainAccount = "DE 4444 5555 6666 7777";
    }

    public void putMoney(String from, int amount) {
        System.out.println("Money from " + from
                + " in amount " + amount + " sent to " + mainAccount);
    }

    private void innerTransfer(String account) {
        System.out.println("Transfer from " + mainAccount + " to " + account);
    }
}
