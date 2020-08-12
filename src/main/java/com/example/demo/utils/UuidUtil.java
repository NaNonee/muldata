package com.example.demo.utils;
import java.util.UUID;

public class UuidUtil {
    public static String uuid(){
        return UUID.randomUUID().toString();
    }
    public static String get32UUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

}
