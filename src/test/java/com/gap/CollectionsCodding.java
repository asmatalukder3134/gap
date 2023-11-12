package com.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class CollectionsCodding {// @Test

	public void sortArrayList() {// ******************sort of arrayList

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("pizza");

		ar.add("cake");

		ar.add("pie");

		for (String a : ar) {

			System.out.println("before sort:" + " " + a);

		}

		Collections.sort(ar);

		for (String rr : ar) {

			System.out.println("after sort:" + " " + rr);

		}

	}

	 @Test

	public void mapToList() {// **************map to list convert

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(4, "cat");

		map.put(5, "dog");

		map.put(6, "cow");
		map.put(3, "ac");
		map.put(1, "bc");

		Collection<String> st = map.values();
		for(String s:st) {
		
			System.out.println("s:"+" "+s);
		
		}
		List<String> li = new ArrayList<String>(st);

		for (String ss : li) {

			//System.out.println(ss);

		}

	}

	//@Test // ****************particular value exist from Hashtable

	public void verifyElementExistInHashTable() {

		Hashtable<Integer, String> htt = new Hashtable<Integer, String>();

		htt.put(1, "aa");

		htt.put(2, "ab");

		htt.put(3, "ac");

		htt.put(4, "ad");

//		Set<Integer>set=htt.keySet();
//
//		Iterator iterator=set.iterator();
//
//		while(iterator.hasNext()) {
//
//			System.out.println(iterator.next());
//
//		}

		if (htt.contains("ac")) {

			System.out.println("yes");

		} else {

			System.out.println("no");

		}

		Enumeration enu = htt.keys();
		htt.remove(3);

		while (enu.hasMoreElements()) {

			System.out.println("enu:" + " " + enu.nextElement());

		}

	}

	// @Test//************REverse FROM ARRAYLIST

	public void reverseArrayList() {

		List<String> li = Arrays.asList("asma", "salma", "ruma", "salma");

//		Collections.reverse(li);
//		System.out.println();

		int size = li.size();

		for (int i = size - 1; i >= 0; i--) {

			// System.out.print(li.get(i));

			// System.out.print(",");

		}

	}

	//@Test

	public void getKeyValueFromHashTable() {// TAKE DATA FROM HASHTABLE

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1, "a");

		ht.put(2, "ab");

		ht.put(3, "aa");

		ht.put(4, "ac");

		Set<Integer> set = ht.keySet();

		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());

		}

		Enumeration enu = ht.keys();

		ht.remove(3);

		while (enu.hasMoreElements()) {

			System.out.println("after remove:" + enu.nextElement());

		}

	}

//REMOVE DUPLICATE FROM LIST

	@Test

	public void duplo() {

		ArrayList<String> li = new ArrayList<String>();

		li.add("asma");

		li.add("salma");

		li.add("ruma");

		li.add("salma");

		System.out.println("before remove:" + " " + li);

		Set<String> set = new HashSet<String>(li);

		for (String ss : set) {

			System.out.println("set:" + " " + ss);
		}
		// OR
		for (int i = 0; i < li.size(); i++) {

			for (int j = i + 1; j < li.size(); j++) {

				String a = li.get(i);

				String a1 = li.get(j);

				if (a.equals(a1)) {

					li.remove(a);

				}

			}

			// System.out.println("after remove:"+li);

		}
	}

	public void bb() {// word wise string reverse

		String name = "asma has 2 cats";
		String[] ar = name.split(" ");
		String rev = "";
		for (String s : ar) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			rev = rev + sb.toString() + " ";
		}
		System.out.println(rev);

	}
//@Test//adding 2 array

	public void addArray() {
		Integer[] a = { 1, 2, 3 };
		Integer[] b = { 4, 5, 6 };
		List li = Arrays.asList(a);
		List li1 = new ArrayList();
		li1.addAll(li);
		li1.addAll(Arrays.asList(b));

		for (Object i : li1) {
			System.out.println(i);

		}
	}

	public void addArra() {// ADD 2 ARRAY&&&&&&&&&&&&&&&&&#############
		Integer[] a = { 1, 2, 3, 7 };
		Integer[] b = { 4, 5, 6, 8 };
		int size1 = a.length;
		int size2 = b.length;
		int index = 0;
		Integer[] c = new Integer[size1 + size2];
		for (int i = 0; i < size1; i++) {

			c[index] = a[i];
			index++;
		}

		for (int j = 0; j < size2; j++) {

			c[index] = b[j];
			index++;
		}
		for (int k = 0; k < c.length; k++) {
			System.out.println(c[k]);
		}
	}

// @Test 
	public void getSet() {
		Integer[] a = { 1, 2, 3, 7, 4, 5 };
		Integer[] b = { 4, 5, 6, 8, 3, 7 };
		List li = Arrays.asList(a);
		List li1 = Arrays.asList(b);
//List li2=new ArrayList();
		Set set = new HashSet();
		set.addAll(li);
		set.addAll(li1);
		System.out.println(set);
	}

	public static void main(String[] args) {
		// int num;
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		// int fact=1;;
		for (int i = 1; i <= num; i++) {
			// fact=fact* i;
			digit = num * i;
			System.out.println(digit);
		}
	}

	public static void mai(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 1, 2, 3, 4, 5 };
		Integer[] b = { 3, 4, 5, 6, 7 };
		List l1 = Arrays.asList(a);
		List l2 = Arrays.asList(b);
		List li = new ArrayList();
		for (int i = 0; i < l1.size(); i++) {
			for (int j = 0; j < l2.size(); j++) {
				if (l1.get(i).equals(l2.get(j))) {
					System.out.println(l1.get(i));
				}

			}

		}

	}
	//@Test
	public void sortArray() {
		Integer[]ar= {5,2,6,4,8,9,2,3,1};
		List li=Arrays.asList(ar);
		Collections.sort(li);
		System.out.println(li);
	}
	public static void ma(String[] args) {
		// TODO Auto-generated method stub
		Integer[]a= {1,2,3,4,5,6};
		Integer[]b= {3,4,5,6,7};
	List li=Arrays.asList(a);
	List lii=Arrays.asList(b);
	List list=new ArrayList();
	list.addAll(li);
	list.addAll(lii);
	
	System.out.println(list);
	
	Set set=new HashSet();
	set.addAll(lii);
	set.addAll(li);
	
	//System.out.println(set);//&&&&&&&&&&&RESULT [1, 2, 3, 4, 5, 6, 7]
	
for(int i=0;i<li.size();i++) {
	for(int j=0;j<lii.size();j++) {
		if(li.get(i).equals(lii.get(j))) {
			System.out.print(li.get(i));//%%%%%%RESULT 3,4,5,6
			System.out.print(",");
			
			
		}
	}
}
}
}
