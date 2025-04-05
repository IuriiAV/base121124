package com.telran.prof.lessoons.lesson25.isp;

@Deprecated
public interface PasswordService {

    String encodePassword(String original);

    String decodePassword(String encoded);
}
