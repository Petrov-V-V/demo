package com.example;

import static org.mockito.Mockito.*;

import java.io.InterruptedIOException;
import org.junit.Test;

public class Task3Test {
    @Test(expected = InterruptedIOException.class)
    public void wasExceptionsThrown() throws InterruptedIOException{
        First first = mock(First.class);
        when(first.throwException()).thenThrow(new InterruptedIOException());
        first.throwException();
    }
}
