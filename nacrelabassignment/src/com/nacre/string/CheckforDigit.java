package com.nacre.string;

public class CheckforDigit {
	
	String strvar;
	
public String getStrvar() {
		return strvar;
	}
	public void setStrvar(String strvar) {
		this.strvar = strvar;
	}

	public String printNumber() {                

	    if(strvar == null || strvar.isEmpty()) {
	    	return "";
	    }
	    	
	    StringBuilder sb = new StringBuilder();
	  //  boolean found = false;
	    for(char c : strvar.toCharArray()){
	        if(Character.isDigit(c)){
	            sb.append(c);
	           // found = true;
	        } 
//	        if(found){
//	            // If we already found a digit before and this char is not a digit, stop looping
//	            break;                
//	        }
	    }

	    return sb.toString();
	}
	public static void main(String[] args) {
		CheckforDigit digit=new CheckforDigit();
		//System.out.println("enter String with numbers: ");
		digit.setStrvar("123siva@675");
		System.out.println(digit.getStrvar());
		String s1=digit.printNumber();
		System.out.println(s1);
		
		
	}

}
