package com.Day5;

import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenDemo {
	public static void main(String[] args) {
		try{
			StringReader str=new StringReader("Hello this is String token demo");
			StreamTokenizer st=new StreamTokenizer(str);
//			st.resetSyntax();
//			st.wordChars('A', 'Z');
//			st.wordChars('a', 'z');
//			st.wordChars(45, 60);
			int type;
			while((type=st.nextToken()) != StreamTokenizer.TT_EOF){
				if(type==StreamTokenizer.TT_WORD)
					System.out.println(st.sval);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
