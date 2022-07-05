package com.example;

public class Second {
    public static boolean returnTrue(){
        return true;
    }

    public static boolean isSeveralTrueReturned(){
        if (First.returnTrue() && returnTrue() && Third.returnTrue())
            return true;
        return false;
    }

    public void callOtherClassesMethods(){
        First.returnTrue();
        Third.returnTrue();
    }
}
