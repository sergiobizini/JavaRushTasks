package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

import java.io.FileNotFoundException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends ArithmeticException{
    }

    static class MyException2 extends NumberFormatException{
    }

    static class MyException3 extends SocketException {
    }

    static class MyException4 extends FileNotFoundException {
    }
}

