package com.Day7;


public class GarbageCollectionDemo {
	public static void main(String[] args) {
		String obj=new String("My String");
		String obj1;//creating a string refernece only not string object
		obj1=obj;
		System.out.println(obj1);
		System.out.println(obj);
		System.out.println(obj1.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		obj=null;
		System.out.println("Object 1 :" +obj1);
		System.out.println("Object :"+obj);
		obj1=null;
		
		GarbageCollectionDemo gcd=new GarbageCollectionDemo();
		GarbageCollectionDemo gg=new GarbageCollectionDemo();
		gcd=null;
		gg=null;
		//test.finalize();
		System.gc();
	}


}
