package com.example.multithreading;

import org.junit.Test;

public class MultithreadingTest {
    @Test
    public void firstTaskTest() {
        Thread thread = new NamePrintThread();
        Thread runnable = new Thread(new NamePrintRunnable());
        thread.start();
        runnable.start();
    }

    @Test
    public void secondTaskTest() throws Exception {
        Thread thread1 = new Thread(() -> System.out.println("thread"));
        thread1.start();
        thread1.join();
    }

    @Test
    public void thirdTaskTest() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    @Test
    public void fourthTaskTest() {
        Resources resource = new Resources();
        Thread thread1 = new Thread(Resources.convertToRunnable(() -> {
            try {
                resource.addResource();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        Thread thread2 = new Thread(Resources.convertToRunnable(() -> {
            try {
                resource.removeResource();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        thread1.start();
        thread2.start();
    }

    @Test
    public void fifthTaskTest() throws Exception {
        Object lock = new Object();
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(5000);
                    synchronized (lock) {
                        System.out.println("Print smth");
                        lock.notify();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.setDaemon(true);
        thread.start();
        synchronized (lock) {
            lock.wait();
        }
    }

    @Test
    public void sixthTaskTest() throws Exception {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
        });
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}