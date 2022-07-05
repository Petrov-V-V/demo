package com.example;

import static org.junit.Assert.assertFalse;

import java.lang.reflect.Method;
import org.junit.Test;

public class Task4Test {
    @Test
    public void wasExceptionsThrown() {
        try {
            Third third = new Third();
            Method method = Third.class.getDeclaredMethod("returnFasle");
            method.setAccessible(true);
            assertFalse((boolean)method.invoke(third));
        }
        catch (Exception e) {}
    }
}
