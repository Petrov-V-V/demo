package com.example.reflection;

import java.util.Random;

public class ReflectionClass {
    public char publicField;
    protected boolean protectedField;
    private int privateField;

    public ReflectionClass() {
    }

    public ReflectionClass(char publicField, boolean protectedField, int privateField) {
        this.publicField = publicField;
        this.protectedField = protectedField;
        this.privateField = privateField;
    }

    private ReflectionClass(char publicField) {
        this.publicField = publicField;
    }

    public boolean publicMethodWithExcpetion() throws NullPointerException {
        throw new NullPointerException();
    }

    private boolean privateMethodWithExcpetion() throws NullPointerException {
        Random rand = new Random();
        privateField = rand.nextInt(50);
        if (privateField > 31)
            return true;
        return false;
    }
}