package com.Day10;
interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ConstructorReference {  
    public static void main(String[] args) {  
    	//option 1 method reference(static ,instance ,constructor)
        Messageable hello = Message::new;  
        hello.getMessage("This is option 1\n");
        //String str="Welcome";
        
        //option2 Using lambda
        Messageable msg1=(str) -> new Message(str);
        msg1.getMessage("This is ioption 2\n");
    
        //option3 using anonymous inner class
        String str2="This is option  3";
        Messageable msg2=new Messageable() {
			@Override
			public Message getMessage(String msg) {
				// TODO Auto-generated method stub
				return new Message(str2);
			}
		};
		
			msg2.getMessage(str2);
       
    }  
}  
