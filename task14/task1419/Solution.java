package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = {1,2,3};
            int x = arr[5];
        } catch (Exception e) { exceptions.add(e);}

        try {
            Object obj = null;
            int[] arr = {1,2,3};
            arr[1] = (int)obj;
        } catch (Exception e){ exceptions.add(e);}

        try {
            Object obj = new ArrayList<Object>();
            int[] arr = {1,2,3};
            arr[1] = (int)obj;
        } catch (Exception e){ exceptions.add(e);}

        try{
            Thread.currentThread().wait();
        } catch (Exception e) {exceptions.add(e);}

        try {
            throw new ArrayStoreException();
        } catch (Exception e) {exceptions.add(e);}

        try {
            throw new ConcurrentModificationException();
        } catch (Exception e) {exceptions.add(e);}

        try {
            throw new EmptyStackException();
        } catch (Exception e) {exceptions.add(e);}

        try {
            throw new IllegalStateException();
        } catch (Exception e) {exceptions.add(e);}

        try {
            throw new IllegalThreadStateException();
        } catch (Exception e) {exceptions.add(e);}
    }
}
