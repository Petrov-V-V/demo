package com.example;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class Task2Test {
    @Test
    public void howManyTimesWasCalled(){
        Second second = spy(Second.class);
        for (int i = 0; i < 3; i++) {
            second.callOtherClassesMethods();
        }
        verify(second, times(3)).callOtherClassesMethods();
    }
}
