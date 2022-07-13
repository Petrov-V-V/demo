package com.example.multithreading;

public class Resources {
    private volatile int sharedResource = 0;

    public synchronized void addResource() throws Exception {
        if (sharedResource > 7)
            wait();
        sharedResource++;
        System.out.println(sharedResource);
        notify();
    }

    public synchronized void removeResource() throws Exception {
        if (sharedResource <= 0)
            wait();
        sharedResource--;
        System.out.println(sharedResource);
        notify();
    }

    public static Runnable convertToRunnable(Runnable runnable){
        return runnable;
    }
}