package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws Exception{
        super(fileName);
            if (!fileName.substring(fileName.lastIndexOf('.'), fileName.length()).equals(".txt")) {
                super.close();
                throw new UnsupportedFileNameException();
            }
    }

    public static void main(String[] args){
    }
}

