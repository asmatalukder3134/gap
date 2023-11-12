package com.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//@Test
	public void sortOfAnArray() {// ##############SORT AN ARRAY
		int[] ar = { 6, 7, 3, 5, 1, 2 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		for (int k = 0; k < ar.length; k++) {
			// System.out.println("after sort"+""+ar[k]);
		}

//$$$$$$$$$$$$$$$SORT BY ARRAYLIST
		Integer[] i = { 44, 22, 55, 33, 11, 66 };
		List li = Arrays.asList(i);
		Collections.sort(li);
		System.out.println(li);// consoleOutput [11, 22, 33, 44, 55, 66]

	}

	// @Test
	public void convertMapToList() {// $$$$$$$$$$$CONVERT MAP TO LIST
		Map map = new HashMap();
		map.put(1, "cat");
		map.put(2, "cat");
		map.put(3, "rat");
		map.put(4, "bat");
		map.put(5, "mat");
		map.put(6, "fat");
		Collection col = map.values();
		List list = new ArrayList(col);
		System.out.println("list:" + "" + list);// consoleOutPut- list:[cat, cat, rat, bat, mat, fat]
		Iterator it = col.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
		}
	}

	// @Test//$$$$$$PARTICULAR VALUE EXIST AND REMOVE IN HASHTABLE
	public void verifyPerticularValueExsist() {
		Hashtable ht = new Hashtable();
		ht.put(1, "pizza");
		ht.put(2, "cake");
		ht.put(3, "bread");
		ht.put(4, "lizza");
		ht.put(5, "cream");
		ht.put(6, "cream");
		boolean bo = ht.contains("cream");
		// System.out.println("bo:"+bo);
		Assert.assertTrue(bo);
		Collection value = ht.values();
		List list = new ArrayList(value);
		Set set = new HashSet(list);// $$$$$REMOVE DUPLICATE FROM LIST
		Iterator its = set.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
		Iterator it = value.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
		}

		// value.remove("pizza");
		if (value.contains("pizza")) {
			// System.out.println("pizza is here");
		} else {
			// System.out.println("no pizza here");
		}
	}

	// @Test//$$$$$REVERSE AN ARRAYLIST
	public void reverseAnArray() {
		int[] ar = { 11, 22, 33, 44, 55, 66 };
		int size = ar.length;
		for (int i = size - 1; i >= 0; i--) {
			// System.out.println(ar[i]);
		}
		Integer in[] = { 66, 77, 88, 99, 10, 20 };

		List li = Arrays.asList(in);
		// Collections.sort(li);
		Collections.reverse(li);
		System.out.println(li);
//		for(int j=li.size()-1;j>=0;j--) {
//			System.out.println(li.get(j));
//		}

	}

	//@Test // $$$$DUPLICATE FROM TWO ARRAY/ARRAYLIST
	public void duplicateFromTwoArray() {
		Integer[] in = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] inn = { 3, 4, 5, 8, 9, 6 };
		List l1 = Arrays.asList(in);
		List l2 = Arrays.asList(inn);

//		for(int i=0;i<l1.size();i++) {
//			for(int j=0;j<l2.size();j++) {
//				if(l1.get(i)==(l2).get(j)) {
//					//System.out.println(l1.get(i));
//				}
		// }
		// }
		int[] p = { 2, 3, 4, 5, 6 };
		int[] ii = { 4, 5, 6, 7, 8 };
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < ii.length; j++) {
				if (p[i] == ii[j]) {
					System.out.println(p[i]);
				}
			}
		}
	}
	//@Test//$$$$
	public void oddAndEvenArray() {
		int[]ar= {1,2,3,4,5,6,7,8};
		int size=ar.length;
		int index=0;
		int[]odd=new int[size];
		int []even=new int[size];
		for(int i=0;i<size;i++) {
			if(ar[i]%2!=0) {
			odd[index]=ar[i];
			index++;
			}
			for(int j=0;j<odd.length;j++) {
				System.out.println(odd[j]);
			}
		}
	}
	//@Test//$$$$$$$$$$$PRIME NUMBER
	public void primeNumber() {
		int num=20;
		for(int i=2;i<=num;i++) {
			for(int j=2;j<=num;j++) {
				if(i==j) {
					System.out.println(i);
				}else if(i%j==0){
					break;
				}
			}
		}
	}
	//@Test
	public void factorealNumber() {
		int num=3;
		int fact=1;
		for(int i=1;i<=3;i++) {
			fact=fact *num;
		}System.out.println(fact);
	}
	//@Test
	public void febonacci() {
	int febo1=1,febo2=1,febonacci=1;
	int num=5;
	for(int i=1;i<=num;i++) {
		febo1=febo2;
		febo2=febonacci;
		febonacci=febo1+febo2;
		
	}System.out.println(febonacci);
	}
	//@Test//MAX AND SMAX 
	public void maxi() {
		int[]ar= {12,4,66,101,99};
		int max=ar[0];
		int smax=ar[0];
		for(int num:ar) {
			if(num>max) {
				smax=max;
				max=num;
				
			}else if(num>smax) {
				smax=num;
			}
		}System.out.println("max"+""+max);
		System.out.println("Smax:"+" "+smax);
	}
	//@Test
	public void max() {
		int[]ar= {22,55,33,77,99};
		int max=ar[0];
		for(int num:ar) {
			if(num>max) {
				max=num;
			}
		}System.out.println(max);
	}
	//@Test
	public void Min() {
		int[]ar= {22,55,33,77,99};
		int min=ar[0];
		for(int num:ar) {
			if(num<min) {
				min=num;
			}
		}System.out.println(min);
	}
	//@Test//ADD 2 ARRAY
	public void addArray() {
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int asize=a.length;
		int bsize=b.length;
		int index=0;
		int[]c=new int[asize+bsize];
		for(int i=0;i<asize;i++) {
			c[index]=a[i];
			index++;
		}
		for(int j=0;j<bsize;j++) {
			c[index]=b[j];
			index++;
		}for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}
	//@Test
	public void addArrays() {
		Integer[]i= {7,8,9};
		Integer[]j= {10,11,12};
		List li=Arrays.asList(i);
		List ll=Arrays.asList(j);
		List le=new ArrayList();
		le.add(li);
		le.add(ll);
		System.out.println(le);
	}
	public void maxNum() {
	int []ar= {1,2,3,4,5,6,7,8,9,10};

	int max=ar[0];
	for(int num:ar) {
		if(num>max) {
			max=num;
		}
	}//System.out.println(max);
	Integer[]aa={1,2,3,4,5,6,7,8,9,10};
	List list=Arrays.asList(aa);
	Collections.sort(list);
	//System.out.println("min:"+list.get(0));
	Collections.reverse(list);
	//System.out.println("max:"+list.get(0));
		}
	@Test
	public void Palin() {
		String word="mom";
		String rev="";
		char[]ch=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		if(rev.equals(word)) {
			System.out.println("pali");
		}else{
			System.out.println("not pali");
		}
		
	}

	}

