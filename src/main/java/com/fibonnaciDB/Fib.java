package com.fibonnaciDB;

import java.math.BigInteger;

public class Fib {
    public static void main(String[] args) {

        int finals=0,num1=1,num2=1;
        int number=50;
        for(int i=3;i<45&&i<number;i++){

            finals=num1+num2;
            num1=num2;
            num2=finals;
        }
        if(number>45){
            BigInteger bi=BigInteger.valueOf(finals);
            BigInteger bi1=BigInteger.valueOf(num1);
            BigInteger bi2=BigInteger.valueOf(num2);

            for(int i=45;i<number;i++){

                bi=bi1.add(bi2);
                bi1=bi2;
                bi2=bi;
            }
            System.out.println(bi);
            System.exit(0);
        }
        System.out.println(finals);
    }

}
