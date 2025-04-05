package com.telran.prof.lessoons.lesson25.isp;

public class BCryptPasswordService implements EncodeService{

    @Override
    public String encodePassword(String original) {
        return original.toLowerCase();
    }

//    @Override
//    public String decodePassword(String encoded) {
//        throw new UnsupportedOperationException();
//    }
}
