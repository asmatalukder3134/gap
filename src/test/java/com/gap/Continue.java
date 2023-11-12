package com.gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Continue {

	public static void main(String[] args) {
//		Integer[]ii= {22,8,2,1,88,16};
//		Integer[]li= {9,6,5,3,9,1,5};
//		List la=Arrays.asList(ii);
//		List ll=new ArrayList();
//		ll.addAll(la);
//		ll.addAll(Arrays.asList(li));
//		for(Object ob:ll) {
//			System.out.println(ob);
//		}
		Map map=new HashMap();
		map.put(1,"asma");
		map.put(2, "alo");
		map.put(3, "plo");
		map.put(4, "jlo");
		map.put(5,"asma");
		map.put(6, "alo");
		map.put(7, "slo");
//		map.remove("plo");
//		map.remove("alo");
		map.put(8, "pori");
		
		Collection set=map.values();
		
		
		Iterator it=set.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	

	}}


