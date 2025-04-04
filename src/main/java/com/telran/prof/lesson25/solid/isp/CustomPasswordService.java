package com.telran.prof.lesson25.solid.isp;

public class CustomPasswordService implements EncodeService,
        DecodeService {

    @Override
    public String encodePassword(String original) {
        return original.toLowerCase();
    }

    @Override
    public String decodePassword(String encoded) {
        return encoded.toUpperCase();
    }
}
