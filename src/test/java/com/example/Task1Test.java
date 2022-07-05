package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task1Test {
    @Test
    public void firstShouldAnswerWithTrue(){
        assertTrue( First.isSeveralTrueReturned() );
    }
    @Test
    public void secondShouldAnswerWithTrue(){
        assertTrue( Second.isSeveralTrueReturned() );
    }
    @Test
    public void thirdShouldAnswerWithTrue(){
        assertTrue( Third.isSeveralTrueReturned() );
    }
}
