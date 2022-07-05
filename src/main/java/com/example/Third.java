package com.example;

public class Third {
    public static boolean returnTrue(){
        return true;
    }

    public static boolean isSeveralTrueReturned(){
        if (First.returnTrue() && Second.returnTrue() && returnTrue())
            return true;
        return false;
    }

    private boolean returnFasle(){
        return false;
    }
}