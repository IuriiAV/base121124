package com.telran.prof.lesson25.solid.isp;

public class BCryptPasswordService implements EncodeService {

    @Override
    public String encodePassword(String original) {
        return original.toLowerCase();
    }
}
