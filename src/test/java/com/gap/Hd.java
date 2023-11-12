package com.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Hd  {
	Generic generic;
	
	// @Test
	public void sorts() {
		// write a function to remove duplicates from string and return unique
		// characters.
		String name = "asma";
		char[] ch = name.toCharArray();
		StringBuilder sb = new StringBuilder(name);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] != ch[i]) {

					System.out.println(ch[i]);

				}
			}

		}
	}

	// @Test
	public void add() {
		for (int i = 2; i <= 20; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				} else if (j % i == 0) {
					break;

				}
			}
		}

	}

	//@Test
	public void max() {
		int []a= {2,4,3,5,4,6,};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);} 
			

	}

	// @Test
	public void removeSpaceFromString() {
		 
		 String name="asma has 2 cats";
		 String []st=name.split(" ");
		 String rev=" ";
		 for(String s:st) {
		 StringBuffer sb=new StringBuffer(s);
		 sb.reverse();
		 
			 rev=rev+sb.toString()+" ";}
		 
	System.out.println(rev);
	
}
	//@Test
	public static void main(int[]args) {
	Integer[]ar= {22,44,33,2,22,44};
	
	//List list=Arrays.asList(ar);
	//System.out.println(list.get(1));
	//Set set=new TreeSet();
	
	for(int a:ar) {
	   HashSet set=new HashSet();
		set.add(a);
		Iterator it=set.iterator();
		if(it.hasNext()) {
		//System.out.println(it.next());
		}
	}
	}
//@Test
	public void ret() {
	int[]ar= {2,3,4,5,6};
	int []odd=new int[ar.length];
	for(int i=0;i<odd.length;i++) {
		if(ar[i]%2 !=0) {
			System.out.println(ar[i]);
		}
	}
	
		 
		 
		 
		
	}
	//@Test
	public static void man() {
		int dayOfWeek = 3;
    	String day;
     	switch (dayOfWeek) {
        	case 1:
            	day = "Monday";
            	break;
        	case 2:
            	day = "Tuesday";
            	break;
        	case 3:
            	day = "Wednesday";
            	break;
        	default:
            	day = "Unknown";
    	}
     	System.out.println(day);
	}
	class Counter {
		private int count =0;
	 	public void increment() {
	    	count++;
		}
	 	public int getCount() {
	    	return count;
		}
	 	public class Main {
	 		Counter counter;
	 		//@Test
	 		public  void ma() {
	 	    	  counter = new Counter();
	 	    	Thread t1 = new Thread();
	 	        	for (int i = 0; i < 1000; i++) {
	 	            	counter.increment();
	 	        	}
	 	        	t1.start();
	 	    	};
	 	     	Thread t2 = new Thread();{
	 	        	for (int i = 0; i < 1000; i++) {
	 	            	counter.increment();
	 	        	}
	 	    	
	 	     	
	 	    	t2.start();
	 	     	System.out.println("Counter: " + counter.getCount());
	 		}
	}
	
	//@Test
	public void runs() {
	Counter counter= new Counter();
	int t=counter.getCount();
	System.out.println("t value:"+""+t);
    	
   	// System.out.println("The length of the text is: " );
	}
	}
	public void exe() {
		generic.getCssValue(null, null, null, null);
	}
	//@Test
	public void doo(){
		String wo="asma has 2 houses";
		String rev=" ";
		String[] ss=wo.split(" ");
		StringBuffer sb=new StringBuffer();
		sb.reverse();
		for(String s:ss) {
			rev=s+sb.toString()+" ";
			System.out.print (rev);
		}
		//  System.out.println(rev);
	}
	@Test
	public  void mai() {
		String name="asma has 2 cats";
		String [] st=name.split(" ");
		String reverse="";
		StringBuffer sb=new StringBuffer();
		sb.reverse();
		
		reverse=reverse+sb.toString();

		System.out.println (reverse); 
		}
		     
	
	//@Test
	public void verifySignInButtonIsDisplayed() {
		int []ar= {33,2,3,11,4};
		int[]br= {1,2,3,4,5,3};
	Arrays.asList(ar);
	Arrays.asList(br);
	List list=new ArrayList();
	list.add(ar);
	list.add(br);
	for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
		
		}}
	








}









	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		 