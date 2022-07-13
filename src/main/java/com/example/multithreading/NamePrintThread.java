package com.example.multithreading;

public class NamePrintThread extends Thread {
    @Override
    public void run() {
        System.out.println("NamePrintThread");
    }
}