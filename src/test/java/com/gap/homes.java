package com.gap;



import java.util.Arrays;

import org.testng.annotations.Test;

public class homes {

	
public void desending() {
	int[] ar= {10,18,7,31,60,70};
	//Set map=new TreeSet();
	
	 int max=ar[0];
	 int smax=ar[0];
	 for(int num:ar) {
		 if(max<num) {
			 smax=max;
			 max=num;
		 }else if(smax<num){
			 smax=num;
			 
		 }
	 }
	//System.out.println("smax:"+smax);
	
	}
	@Test
	public void ac() {
		int cost = 5000;

		int quant = 10;

		int days = 10;

		int discountcoupon = (cost > 3000)? (quant >11) ? 10 : days >9 ?20 :30: 5;

		 

		//System.out.println(discountcoupon);
	}
	@Test
	public void sArray() {
		int[] ar= {10,18,7,31,60,70};
		Arrays.sort(ar);
		
		for(int i=0;i<ar.length;i++) {
		//System.out.println("ar:"+ar[i]);
		
	}
	
	}@Test
	public void sd() {
		int []a= {22,66,44,11,222};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int t=a[i];
                    a[i]=a[j];
                    a[j]=t;}
			}
		}
		for(int k=0;k<a.length;k++) {
			//System.out.println(a[k]);
		}
	}
	@Test
	public void sw() {
		int num=123;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=digit+rev*10;
			//sum=sum+digit;//*************FOR SUM ***************
			num=num/10;
		}
		//System.out.println(rev); 
	}
	@Test
	public void swip() {
	//List<String>nameList=new ArrayList<String>();
		
	}
	
}
