package com.example;

public class Second {
    private First first = new First();

    public boolean returnTrue(){
        return true;
    }

    public void callOtherClassesMethods(){
        first.returnTrue();
        Third.returnTrue();
    }
}
