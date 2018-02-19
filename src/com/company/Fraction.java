package com.company;

public class Fraction {
    int numerator=0;
    int denominator=0;
    int[] fract={0,1};


    public int[]  multi(int num1, int denum1,int num2,int denum2) {
        fract[0]=num1*num2;
        fract[1]=denum1*denum2;

        return fract;
    }

    public int[]  plus(int num1, int denum1,int num2,int denum2) {
        fract[0]=num1*denum2+num2*denum1;
        fract[1]=denum1*denum2;

        return fract;
    }


    }

