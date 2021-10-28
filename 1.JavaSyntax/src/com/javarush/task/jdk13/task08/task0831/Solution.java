package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        BoardGame checkers = new BoardGame();
        checkers.name = "Шашки";
        collection[1] = checkers;

        BoardGame go = new BoardGame();
        go.name = "Го";
        collection[2] = go;

        BoardGame cards = new BoardGame();
        cards.name = "Карты";
        collection[3] = cards;

        BoardGame backgammon = new BoardGame();
        backgammon.name = "Нарды";
        collection[4] = backgammon;


        System.out.println(Arrays.toString(collection));
    }
}