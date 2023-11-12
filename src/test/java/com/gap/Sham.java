package com.gap;

import org.testng.annotations.Test;

public class Sham {
	@Test
	public void oddEvenArray() {
		int[] a = { 2, 6, 7, 3, 24, 13, 24, 5, 67, 23, 9, 12, 25, 8 };
		
		int asize=a.length;
		int index=0;
		int []even=new int[asize];
		int[]odd=new int[asize];
		for(int i=0;i<asize;i++) {
			if(a[i]%2==0) {
				even[index]=a[i];
				index++;
			}
		}
		for(int j=0;j<even.length;j++) {
			System.out.println(even[j]);
		}
		for(int x=0;x<asize;x++) {
		if(a[x]%2!=0) {
			odd[index]=a[x];
			index++;
		}
		}for(int y=0;y<odd.length;y++) {
			System.out.println("odd:"+odd[y]);
		}
		
		}	
	}
