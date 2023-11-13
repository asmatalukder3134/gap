package allGapData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Asma extends Homes {
	void vv() {
		int xx;
	}
//	public static void main(String[] args) {
//		char c = 65;
//		System.out.println("c = " + c);
//	}
//	public static void main(String[] args) {
//        int x = 10*20-20; 
//        System.out.println(x); 
//        Homes hm=new Homes();
//        hm.bb();
//       Asma aa= (Asma)hm;
//       aa.vv();
//    }
	// public static void main(String[] args) {
//			int dayOfWeek = 2  ;
//	    	String day;
//	     	switch (dayOfWeek) {
//	        	case 1:
//	            	day = "Monday";
//	            	break;
//	        	case 2:
//	            	day ="Wednesday" ;
//	            	break;
//	        	case 3:
//	            	day ="Tuesday";
//	            	break;
//	        	default:
//	            	day = "Unknown";
//	    	}
//	     	System.out.println(day);
//			

	public static void main(String[] args) {
		Integer[] a = { 2, 4, 3, 5, 7, 6, 9, 8, 77, 99, 55 };
		List la = Arrays.asList(a);
		// la.addAll(a);
		// la.remove(1);
		// System.out.println(la);

		List li = new ArrayList();
		li.add(10);
		li.add(20);
//		li.add("asma");
//		li.add("lima");
//		li.add("lima");
//		li.add("ema");
		li.add(20);
		li.add(30);
		Collections.sort(li);
		// System.out.println("index three"+li.get(3));
		for (Object ob : li) {
			// System.out.println("ob"+ob);
		}

		// Collections.sort(li);
		// Collections.reverse(li);

		Map map = new HashMap();
		map.put(1, "cake");
		map.put(2, "fake");
		map.put(3, "lake");
		map.put(4, "cake");
		map.put(5, "cake");
		Set set = map.keySet();
		Collection c = map.values();
		for (Object obb : c) {
			System.out.println("obb:" + obb);
		}
		Iterator it = set.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
		}
List l=new ArrayList();
//l.add(5, "break");
l.addAll(c);
for(Object o:l) {
System.out.println("oo:"+o);
}
	}
}
