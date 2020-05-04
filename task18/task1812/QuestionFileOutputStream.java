package com.javarush.task.task18.task1812;

/* 
Расширяем AmigoOutputStream
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
        private AmigoOutputStream component;

        public QuestionFileOutputStream(AmigoOutputStream component) { this.component = component; }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void close() throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (cmdReader.readLine().equals("Д")) component.close();
    }
}

