package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)){
            String str = scanner.nextLine().replaceAll("\\s","");
            List<Character> listVowel = new ArrayList<>();
            List<Character> listConsonant = new ArrayList<>();
            for (int i = 0; i < str.length(); i++){
                if(isVowel(str.charAt(i))) listVowel.add(str.charAt(i));
                else listConsonant.add(str.charAt(i));
            }
            for(Character c: listVowel) System.out.print(c + " ");
            System.out.println();
            for(Character c: listConsonant) System.out.print(c + " ");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}