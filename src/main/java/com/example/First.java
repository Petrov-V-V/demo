package com.example;

import java.io.InterruptedIOException;

public class First {
    public static boolean returnTrue(){
        return true;
    }

    public static boolean isSeveralTrueReturned(){
        if (returnTrue() && Second.returnTrue() && Third.returnTrue())
            return true;
        return false;
    }

    public boolean throwException() throws InterruptedIOException{
        throw new InterruptedIOException();
    }
}
