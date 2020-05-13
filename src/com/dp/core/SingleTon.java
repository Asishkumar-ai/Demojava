package com.dp.core;

import java.io.Serializable;

public class SingleTon implements Serializable,Cloneable {
	//Eager Instation object crate
	
	/* private static SingleTon instance =new SingleTon(); */
	
	//Lagy Inistation
	private static volatile SingleTon instance;

	private SingleTon() {
		super();
		System.out.println("singleton..object cteated");
	}

	
	  public static SingleTon getInstance() { 
	   if (instance == null) 
		  synchronized (SingleTon.class) {
			  if (instance==null) {
	     
		         instance =new SingleTon(); 
	     }
	    } return instance; 
	  }
	 
	  
		
		/*
		 * protected Object clone()throws { return throw new
		 * CloneNotSupportedException() ;
		 * 
		 * }
		 */
		 
		/*
		 * public static SingleTon getInstance() { 
		 * return instance;
		 * 
		 * }
		 */
	
	
            
}
