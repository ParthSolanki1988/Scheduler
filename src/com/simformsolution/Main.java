package com.simformsolution;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * @threadscheduler : A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
 * @Priority : thread has got a better chance of getting picked up by the thread scheduler.
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("Inside : " + Thread.currentThread().getName());

    System.out.println("Creating Executor Service with a thread pool of Size 10");
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

    for (int i = 1; i <= 12; i++) {
//      Params:
//        callable – the function to execute
//        delay – the time from now to delay execution
//        unit – the time unit of the delay parameter

      scheduledExecutorService.schedule(new Task(i) , i , TimeUnit.SECONDS);
    }
  }
}
