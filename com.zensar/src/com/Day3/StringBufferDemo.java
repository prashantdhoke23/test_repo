package com.Day3;

public class StringBufferDemo {
	  int id;
	public static void main(String[] args) {
		String str="Hello World";
		StringBuffer strbuf=new StringBuffer("Hello World");
		StringBuffer strbuf1=new StringBuffer(str);
		System.out.println(str.hashCode());
	System.out.println(strbuf.hashCode());
	System.out.println(strbuf1.hashCode());
	strbuf.append("Welcome to java");
	System.out.println(strbuf);
	StringBufferDemo sbd=new StringBufferDemo();
	System.out.println(sbd.hashCode());
	}
	///Generate hashcode of int variable id using source ->Generate Hascode()and equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringBufferDemo other = (StringBufferDemo) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
