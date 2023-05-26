package com.simformsolution;
public class Task implements Runnable{
  private final int threadNumber;
  public Task(int threadNumber) {
    this.threadNumber = threadNumber;
  }

  @Override
  public void run() {
    System.out.println("Executing inside : " + Thread.currentThread().getName() + " , Task  " + threadNumber + " , State : " + Thread.currentThread().getState());
  }
}
