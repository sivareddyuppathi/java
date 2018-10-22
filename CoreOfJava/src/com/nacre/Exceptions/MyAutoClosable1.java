package com.nacre.Exceptions;

public class MyAutoClosable1 implements AutoCloseable {
    void display8(String str){
    	if (str!=null){
    		throw new RuntimeException();
    		}
    	else{
    			System.out.println("Yeh,I don't have exception");
    		}
    }
    void display8()
    {
    	System.out.println("Shiva");
    }
    public static void main(String args[])throws Exception{
    	
    	try (MyAutoClosable1 m=new MyAutoClosable1())
    	{
    		m.display8(null); 
    		}   
    }
	//@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
