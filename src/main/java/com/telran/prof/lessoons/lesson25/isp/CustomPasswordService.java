package com.telran.prof.lessoons.lesson25.isp;

public class CustomPasswordService implements EncodeService, DecodeService{
    @Override
    public String encodePassword(String original) {
        return original.toLowerCase();
    }

    @Override
    public String decodePassword(String encoded) {
        return encoded.toUpperCase();
    }
}
