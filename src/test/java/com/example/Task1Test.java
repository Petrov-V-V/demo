package com.example;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class Task1Test {
    @Test
    public void shouldAnswerWithTrue() {
        First first = mock(First.class);
        when(first.returnTrue()).thenReturn(true);
        Second second = mock(Second.class);
        when(second.returnTrue()).thenReturn(true);
        Third third = new Third(first, second);
        assertTrue(third.isSeveralTrueReturned());
    }
}