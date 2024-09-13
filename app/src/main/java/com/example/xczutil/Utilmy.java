package com.example.xczutil;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;

public final class Utilmy {
    public static final Utilmy INSTANCE = new Utilmy();
    private static final String ALGORITHM_NAME = "MD5";
    private static final String CHARSET_NAME = StandardCharsets.UTF_8.name();

    private Utilmy() {
    }






}
