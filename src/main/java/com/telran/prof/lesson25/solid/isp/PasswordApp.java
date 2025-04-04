package com.telran.prof.lesson25.solid.isp;

public class PasswordApp {

    public static void main(String[] args) {
        CustomPasswordService customPasswordService = new CustomPasswordService();
        printEncoded(customPasswordService);
        printDecoded(customPasswordService);

        BCryptPasswordService bCryptPasswordService = new BCryptPasswordService();
        printEncoded(bCryptPasswordService);
    }

    private static void printEncoded(EncodeService service) {
        System.out.println(service.encodePassword("HELLO"));
    }

    private static void printDecoded(DecodeService service) {
        System.out.println(service.decodePassword("HELLO"));
    }
}
