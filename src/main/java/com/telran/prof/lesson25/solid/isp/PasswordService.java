package com.telran.prof.lesson25.solid.isp;

@Deprecated
public interface PasswordService {

    String encodePassword(String original);

    String decodePassword(String encoded);
}