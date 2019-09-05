package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] counts = new int[33];
        for(int i = 0; i <list.size(); i++){
            char[] tmp = list.get(i).toCharArray();
            for (int j = 0; j < tmp.length; j++){
                if(tmp[j]!=' '){
                    for(int x = 0; x < alphabet.size(); x++){
                        if(tmp[j]==alphabet.get(x)){
                            counts[x] = counts[x] + 1;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < alphabet.size(); i++){
            System.out.println(alphabet.get(i) + " " + counts[i]);
        }
    }
}
