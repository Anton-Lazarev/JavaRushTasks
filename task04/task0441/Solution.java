package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cmdInput = new BufferedReader(new InputStreamReader(System.in));

        String inNum = cmdInput.readLine();
        int a = Integer.parseInt(inNum);
        inNum = cmdInput.readLine();
        int b = Integer.parseInt(inNum);
        inNum = cmdInput.readLine();
        int c = Integer.parseInt(inNum);

        if ((a <= b && b <= c) || (c <= b && b <= a)) System.out.println(b);
        if ((b < a && a <= c) || (c <= a && a < b)) System.out.println(a);
        if ((a < c && c < b) || (b < c && c < a)) System.out.println(c);
    }
}
