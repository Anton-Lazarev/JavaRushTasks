package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        char[] messageToChar = message.toCharArray();

        ArrayList<Character> listVowels = new ArrayList<>();
        ArrayList<Character> anotherChars = new ArrayList<>();

        for (int i = 0; i < messageToChar.length; i++){
            if (isVowel(messageToChar[i])){
                listVowels.add(messageToChar[i]);
            } else if (messageToChar[i] == ' '){
                continue;
            } else {
                anotherChars.add(messageToChar[i]);
            }
        }

        for (char c : listVowels){
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : anotherChars){
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}