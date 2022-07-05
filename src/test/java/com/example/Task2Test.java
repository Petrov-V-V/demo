package com.example;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class Task2Test {
    @Test
    public void howManyTimesWasCalled(){
        Second second = mock(Second.class);
        second.callOtherClassesMethods();
        verify(second).callOtherClassesMethods();
    }
}
