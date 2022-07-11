package com.example.reflection;

import java.lang.reflect.*;

import org.junit.Test;

public class ReflectionTest {
    @Test
    public void firstTaskTest() throws Exception {
        ReflectionClass object = new ReflectionClass();
        Field privateField = object.getClass().getDeclaredField("privateField");
        privateField.setAccessible(true);
        privateField.setInt(object, 3);
        System.out.println(privateField.getInt(object));

        Field publicField = object.getClass().getDeclaredField("publicField");
        System.out.println(publicField.getName());

        Field protectedField = object.getClass().getDeclaredField("protectedField");
        System.out.println(protectedField.getType());
    }

    @Test
    public void secondTaskTest() throws Exception {
        ReflectionClass object = new ReflectionClass();
        Method method = object.getClass().getDeclaredMethod("privateMethodWithExcpetion");
        method.setAccessible(true);
        System.out.println(method.invoke(object));

        for (Method m : object.getClass().getSuperclass().getMethods()) {
            System.out.println("Method " + m.getName());
        }

        Class[] exceptions = method.getExceptionTypes();
        for (Class e : exceptions) {
            System.out.println(e.getSimpleName());
        }
    }

    @Test
    public void thirdTaskTest() throws Exception {
        Constructor<ReflectionClass> publicConstructor = ReflectionClass.class.getDeclaredConstructor(char.class,
                boolean.class, int.class);
        System.out.println(publicConstructor);

        Constructor<ReflectionClass> privateConstructor = ReflectionClass.class.getDeclaredConstructor(char.class);
        privateConstructor.setAccessible(true);
        ReflectionClass object = privateConstructor.newInstance('a');

        Class[] types = publicConstructor.getParameterTypes();
        for (Class t : types) {
            System.out.println(t.getName());
        }
    }
}