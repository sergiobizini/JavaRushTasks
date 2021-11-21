package com.javarush.task.task14.task1414;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        Set<String> set = new HashSet<>();
        Movie movie = null;
        MovieFactory mfactory = new MovieFactory();
        Collections.addAll(set,"cartoon", "thriller", "soapOpera");
        do
        {
            key = reader.readLine();
            movie = mfactory.getMovie(key);
            if (set.contains(key)) System.out.println(movie.getClass().getSimpleName());

        }while (set.contains(key));
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }


}
