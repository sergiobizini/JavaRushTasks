package com.javarush.task.jdk13.task09.task0930;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraySorter {

    public void sort(String[] array) {
        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<array.length;i++){
            if(isNumber(array[i])) numbers.add(Integer.parseInt(array[i]));
            else strings.add(array[i]);
        }

        if (isGreaterThan("a","b")){}

        Collections.sort(numbers);
        Collections.sort(strings, Collections.reverseOrder());

        Stack<Integer> integerStack = new Stack<>();
        integerStack.addAll(numbers);

        Stack<String> stringStack = new Stack<>();
        stringStack.addAll(strings);

        for (int i = 0; i<array.length;i++){
            if(isNumber(array[i])) array[i] = String.valueOf(integerStack.pop());
            else array[i] = stringStack.pop();
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];
            if ((i != 0 && character == '-') // Строка содержит '-'
                    || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && character == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
