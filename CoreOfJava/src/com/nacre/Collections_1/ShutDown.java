package com.nacre.Collections_1;

import java.io.IOException;

public class ShutDown {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	 //  Runtime r=Runtime.getRuntime();
		System.out.println();
	  try
	  {
		//r.exec("shutdown -s -t 0");
		  Process p=Runtime.getRuntime().exec("shutdown -s -t 0");
	  } 
	  catch (IOException e)
	  {
		e.printStackTrace();
	}
	
	  
	  
	  
	  
	  
	  
	  
		/* public static void main(String[] args) {
			 Runtime r=Runtime.getRuntime();   //object of Runtime class
		      try {

		         // print a message
		         System.out.println("Executing Notepad.exe");
		         
		         r.exec("notepad"); //use this line and object to open note pad else use only process line 
		         
		         // create a process and execute notepad.exe
		       //  Process process = Runtime.getRuntime().exec("Notepad.exe");

		         // print another message
		         System.out.println("Notepad should now open.");

		      } catch (Exception ex) {
		         ex.printStackTrace();
		      }*/
}
}
