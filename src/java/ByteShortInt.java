package com.company;

public class Main {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        byte myByteValue = 100;
        // 2. Create a short variable and set it to any valid short number.
        short myShortValue = 1000;
        // 3. Create a int variable and set it to any valid int number.
        int myIntValue = myByteValue * myShortValue * 10;
        // 4. Create a variable of type long and make it equal to 5000 + 10 times the sum of the byte, plus the short, plus the int
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println(myLongValue);


    }
}
