package com.ivoyant;

import java.util.Random;

public class GetID {
    public static String id(String fromAddress, String toAddress){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < 3; j++) {
            int digit = random.nextInt(10);
            stringBuilder.append(digit);
        }
        return fromAddress+toAddress+stringBuilder.toString();
    }
}
