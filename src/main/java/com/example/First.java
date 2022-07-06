package com.example;

import java.io.InterruptedIOException;

public class First {
    public boolean returnTrue(){
        return true;
    }

    public boolean throwException() throws InterruptedIOException{
        throw new InterruptedIOException();
    }
}