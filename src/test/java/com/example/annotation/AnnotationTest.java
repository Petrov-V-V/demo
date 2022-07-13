package com.example.annotation;

import java.lang.reflect.*;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import org.junit.Test;

public class AnnotationTest {
    @MyAnnotation(command = "method number 1", queueNumber = 1)
    public void firstMethod() {
        System.out.println("method number 1");
    }

    @MyAnnotation(command = "method number 3", queueNumber = 3)
    public void secondMethod() {
        System.out.println("method number 3");
    }

    @MyAnnotation(command = "method number 2", queueNumber = 2)
    public void thirdMethod() {
        System.out.println("method number 2");
    }

    public Map<Method, Integer> myAnnotationsMethods() {
        Map<Method, Integer> map = new HashMap<>();
        for (Method m : AnnotationTest.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyAnnotation.class))
                map.put(m, m.getAnnotation(MyAnnotation.class).queueNumber());
        }
        System.out.println(map);
        return map;
    }

    @Test
    public void runningMethodsInSequence() {
        for (Method m : myAnnotationsMethods().entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
                .keySet()) {
            try {
                m.invoke(this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
