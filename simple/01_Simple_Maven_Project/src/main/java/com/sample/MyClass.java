package com.sample;

public class MyClass {

    public static void main( String[] args ) {
        MyClass obj = new MyClass();
		obj.method();
    }
    
    public void method(){    	
        System.out.println("Date : " + new java.util.Date());
    }
}
