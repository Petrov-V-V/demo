package com.example;

public class Third {
    private First first;
    private Second second;

    public Third() {
        this.first = new First();
        this.second = new Second();
    }

    public static boolean returnTrue(){
        return true;
    }

    public boolean isSeveralTrueReturned(){
        if (first.returnTrue() && second.returnTrue() && returnTrue())
            return true;
        return false;
    }

    private boolean returnFasle(){
        return false;
    }
}