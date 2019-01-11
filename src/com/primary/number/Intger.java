package com.primary.number;

public class Intger {
    
    public boolean narcissisticNumber (long num) {
        boolean flag = false;
        long b = num / 100;
        long c = (num % 100) / 10;
        long d = num % 10;
        if((b*b*b+c*c*c+d*d*d) == num) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
    
}
