package com.gap;

import org.testng.annotations.Test;

public class Supply {
	@Test
	public void sorts() {
		int [] ar= {25,90,30,73,80};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}System.out.println(ar[i]);
		}
		
	}
@Test
public void lis() {
	//List<Object>li=new ArrayList<Object>();
}
}
