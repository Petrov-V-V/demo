package com.example.multithreading;

public class NamePrintRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("NamePrintRunnable");
    }
}