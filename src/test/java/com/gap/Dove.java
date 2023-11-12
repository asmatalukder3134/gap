package com.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class Dove {
	// @Test
	public void even() {
		int[] a = { 2, 6, 7, 3, 24, 13, 24, 5, 67, 23, 9, 12, 25, 8 };
		int size = a.length;
		int digit = 0;
		int[] evens = new int[size];
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				evens[digit] = a[i];
				digit++;
			}
		}
		for (int j = 0; j < evens.length; j++) {
			System.out.println(evens[j]);
		}

	}

	//@Test
	public void duplo() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

//@Test   
	public void wq() {

		String name = "Asma Talukder";
		char[] ch = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
		int[] a = { 2, 6, 7, 3, 24, 13, 24, 5, 67, 23, 9, 12, 25, 8 };
		int size = a.length;
		int[] aa = new int[size];
		int digit = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 != 0) {
				int t = a[i];
			}
		}
	}

//@Test
//	public  void mai() {
//		String name="asma has 2 cats";
//		String [] st=name.split(" ");
//		String reverse="";
//		for(String s:st) {
//		StringBuffer sb=new StringBuffer(s);
//		sb.reverse();
//		
//		reverse=s+sb.toString()+"";
//		System.out.print(reverse);
//		
//				}// System.out.println(reverse); 
//		 }
	//@Test
	public void mai() {
		String name = "mum";

		char[] ch = name.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}
		System.out.println(rev);
		if (name.equals(rev)) {
			System.out.println("pali");
		}else {
			System.out.println("not pali");
		}
	}
	
	//@Test
	public void revInt() {
		int num=123;
		int digit;
		int rev=0;
		while(num>0) {
			digit=num%10;
			rev=digit+rev*10;
			num=num/10;
		}System.out.println(rev);
	}
	//@Test//adding 2 array
	
	public void addArray() {
		Integer []a= {1,2,3,7,4,5};
		Integer []b= {4,5,6,8,3,7};
	List li=Arrays.asList(a);
	List li1=Arrays.asList(b);
	List li2=new ArrayList();
	li2.addAll(li);
	li2.addAll(li1);
	System.out.println("li"+""+li2);
	Set set=new HashSet();
	set.addAll(li);
	set.addAll(li2);
	System.out.println(set);
			
//		List li=Arrays.asList(a);
//		List li1=new ArrayList();
//		li1.addAll(li);
//		li1.addAll(Arrays.asList(b));
//		
//		for(Object i:li1) {
//			System.out.println(i);
			
		}
	

//@Test
public void sortArray() {
	int[]ar= {5,2,6,4,8,9,2,3,1};
	 for(int i=0;i<ar.length;i++) {
		 for(int j=i+1;j<ar.length;j++) {
			 if(ar[i]>ar[j]) {
			 int t=ar[i];
			 ar[i]=ar[j];
			 ar[j]=t;
			 
		 }
		 		 }
		 
		 
		 
		 
		 
		 
		 
	 }
	 for(int k=0;k<ar.length;k++) {
		 System.out.println(ar[k]);
	 }

	
}

@Test
public void bb() {  
	Integer[]a= {2,6,4,8,3};
	Integer[]b= {9,2,4,7,1};
	List li=Arrays.asList(a);
	List ll=Arrays.asList(b);
	for(int i=0;i<li.size();i++) {
		for(int j=0;j<ll.size();j++) {
			if(li.get(i)==(ll.get(j))) {
				System.out.println(li.get(i));
			}
		}
	}
	
	}
}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

