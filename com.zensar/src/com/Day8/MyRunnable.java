package com.Day8;

public class MyRunnable implements Runnable{
	
@Override
public void run() {
    // TODO Auto-generated method stub
    System.out.println(Thread.currentThread().getName()+"  is running now!");
}

public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread("Direct Thread");

    Thread t2 = new Thread(new MyRunnable(),"Annonymous Runnable Thread");

    MyRunnable target = new MyRunnable();

    Thread t3 = new Thread(target,"Direct Runnable Thread");
    System.out.println("t1 state = "+t1.getState());
    t1.start();
    t1.sleep(1000);
    System.out.println("t1 state = "+t1.getState());
//    t1.start();
    System.out.println("t2 state = "+t2.getState());
    t2.sleep(1000);
    t2.start();
    System.out.println("t2 state = "+t2.getState());
    System.out.println("t3 state = "+t3.getState());
    t3.start();

    System.out.println("t3 state = "+t3.getState());

    t3.sleep(1000);

}

}