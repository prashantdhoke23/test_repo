package com.Day8;

public class ThreadDemo {
	public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        Thread t1 = new Thread("myThread");
		        System.out.println("MIN PRIORITY =" + Thread.MIN_PRIORITY);
		        System.out.println("MAX PRIORITY =" + Thread.MAX_PRIORITY);
		        System.out.println("NORMAL PRIORITY =" + Thread.NORM_PRIORITY);
//		        System.out.println("MIN PRIORITY" + Thread.MIN_PRIORITY);
		 
		        System.out.println("t1 id =" + t1.getId());
		        System.out.println("t1 name =" + t1.getName());
		        t1.setPriority(Thread.MAX_PRIORITY);
		        System.out.println("t1 priority = " + t1.getPriority());
		        System.out.println("t1 state =" + t1.getState());
		 
		        t1.start();
		 
		        System.out.println("t1 state =" + t1.getState());
		 
		        t1.run();
		      //  t1.sleep(1000);
		 
		        Thread t2 = new Thread("MyThread2");
		        System.out.println("t2 state =" + t2.getState());
		        t2.start();
		        System.out.println("t2 state =" + t2.getState());
		        t1.yield();
		        t2.run();
		        System.out.println("t2 state =" + t2.getState());
		        System.out.println("t1 state =" + t1.getState());
		    }
		 
		

}
