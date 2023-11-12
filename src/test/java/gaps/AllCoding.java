package gaps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllCoding {
	// @Test
	public void revString() {
		String name = "asma";
		StringBuffer sb = new StringBuffer(name);
		String revName = sb.reverse().toString();
		if (name.equals(revName)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	// @Test
	public void revstring() {
		String name = "mum";
		String rev = "";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		if (name.equals(rev)) {
			System.out.println("mum:" + "" + "palindrome");
		} else {
			System.out.println("mum:" + "" + "not a palindrome");

		}

	}
	//@Test
		public void oddEvenArray() {

			int[] a = { 2, 6, 7, 3, 24, 13, 24, 5, 67, 23, 9, 12, 25, 8 };
			int asize = a.length;
			int[] even = new int[asize];
			int[] odd = new int[asize];
			int index = 0;
			for (int i = 0; i < asize; i++) {
				if (a[i] % 2 == 0) {
		 			even[index] = (a[i]);
					index++;
				}

			}
			for (int j = 0; j < even.length; j++) {
				System.out.print("even array" + " " + even[j]);
				//System.out.println();
			}
			for (int k = 0; k   < asize; k++) {
				if (a[k] % 2 != 0) {
					odd[index] = a[k];
					index++;

				}
			
		
			for (int x = 0; x < odd.length; x++) {
		
				System.out.print("odd array:" + " " + odd[x]);
			}
			}}

//@Test	
	public void revInt() { 
		int num = 123;
		int digit;
		int rev = 0;
		while (num > 0) {
			digit = num % 10;
			rev = digit + rev * 10;
			num = num / 10;
		}
		System.out.println("revInt:" + " " + rev);
	}
	public void amni() {
		System.out.println("amni delam");
	}

//@Test	
	public void revIntSum() {
		int num = 123;
		int digit;
		int sum = 0;
		while (num > 0) {
			digit = num % 10;
			sum = digit + sum;
			num = num / 10;
		}
		System.out.println("revIntSum:" + " " + sum);
	}

//swipe two number without using 3rd number

//@Test
	public void swipeNum() {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}

//@Test
	public void vowelPresentOrNot() {
		String name = "asmatalukder";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'a') {
				System.out.println(ch[i]);
			}
		}

	}

//****************PRIME NUMBER
//@Test
	public void primeNumber() {
		int num = 20;
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println(i);
				} else if (i % j == 0) {
					break;
				}
			}
		}

	}// *****************FIBONACCI
//@Test

	public void fibonacci() {
		int febo1 = 1, febo2 = 1, fibonacci = 1;
		int num = 5;
		for (int i = 0; i < num; i++) {
			febo1 = febo2;
			febo2 = fibonacci;
			fibonacci = febo1 + febo2;
		}
		System.out.println(fibonacci);

	}

//***************ODD NUMBER
//@Test
	public void oddNumber() {
		int num = 20;
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println("odd" + "" + i);
			}
		}

	}

//**************REMOVE SPACE IN STRING
//@Test
	public void removeSpaceFromString() {
		String name = "asma Talukder";
		String[] ar = name.split(" ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			System.out.print("");
		}

	}

//******************REV A STRING BY WORD
//@Test
	public void revByWord() {
		String word = "asma has 2 cats";
		String[] nw = word.split(" ");
		String revWord = " ";
		for (String s : nw) {
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			revWord = revWord + sb.toString() + " ";

		}
		System.out.println(revWord);
	}

//****************************EXCHANGE VALUE OF TWO STRING
//@Test
	public void ExchangeValueOfTwoString() {
		String name1 = "asma";
		String name2 = "shamim";
		String[] ar = { "asma", "shamim" };
		int size = ar.length;
		for (int i = 0; i < size; i++) {
			name2 = ar[0];
			name1 = ar[1];
		}
		System.out.println("name1:" + "" + name1);
		System.out.println("name2:" + "" + name2);
	}

//***************LEADING AND TARILING SPACE
//@Test
	public void leadingAndTrailingSpace() {
		String s = "  st qa/plm";
		String stp = s.strip();
		System.out.println(stp);
	}
	//********************MAX/MIN NUMBER FROM ARRAY
	public void max() {//FOR MIN a<max
		int[]ar= {22,3,55,11,80,111};
		int  max=ar[0];
		for(int a:ar) {
			if(a>max) {
				max=a;
			}
		}System.out.println("max:"+" "+max);
	}
	//**********************MAX AND SMAX FROM AN ARRAY
	public void maxx() {
		int[]ar= {22,3,55,11,80,111};
		int  max=ar[0];
		int smax=ar[0];
		for(int a:ar) {
			if(a>max) {
				smax=max;
				max=a;
			}else if(a>smax) {
				smax=a;
			}
		}System.out.println("max:"+" "+max);
		System.out.println("smax:"+" "+smax);
	}



//*******************SORT  AN ARRAY
@Test
	public void sortArray() {
		int[] ar = { 1, 66, 22, 3, -2 };
	Arrays.sort(ar);
	for(int i=0;i<ar.length;i++ ) {
		System.out.println("ar[i]"+ ar[i]);
	}

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {// descending j>i(66,22,3,1,-2) ******//Asc ending i>j(-2,1,3,22,66)
					int t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}

		}
		for (int i = 0; i < ar.length; i++) {
			//System.out.println(ar[i]);
		}

	}

//***************FACTORIAL
//@Test
	public void factorial() {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("fact:" + "" + fact);

	}

//**********************REVERSE ARRAYLIST
//@Test
	public void revList() {
		List<String> li = Arrays.asList("asma", "salma", "lima");
		int size = li.size();
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(li.get(i));
		}
	}

	//@Test
	public void Pyramids() {//****************PYRAMID PATERN
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--)  {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
			
			          
		}
	}

	
	
	 

	@Test
	public void add() {//PRIME NUMBER
		for(int i=2;i<=20;i++) {
			for(int j=2;j<=20;j++) {
				if(j==i) {
			  		System.out.println(i);
				}else if(i%j==0){
					break;
					
				}
			}
		}



}   
	//@Test
	public void dupli() {//*****************DUPLICATE FROM TWO ARRAY
		 int []arr1 = { 11, 1, 13, 21, 3, 7,18,8 };   
		 int[] arr2 = { 11,5, 3, 7, 1,8 };
		int size=arr1.length;
		int size2=arr2.length;
		for(int i=0;i<size;i++){
		for(int j=0;j<size2;j++){

		if(arr1[i]==arr2[j]){
		System.out.println(arr1[i]);
		
		}//Assert.assertTrue(arr1[i]==arr2[j]); 
		}
		}
	}
//	//@Test
//
//			public void sortArrayList() {//******************sort of arrayList
//
//				ArrayList<String>ar=new ArrayList<String>();
//
//				ar.add("pizza");
//
//				ar.add("cake");
//
//				ar.add("pie");
//
//				for(String a:ar) {
//
//					
//
//				}System.out.println("before sort:"+" "+ar);
//
//				Collections.sort(ar);
//
//				for(String rr:ar) {
//
//					System.out.println("after sort:"+" "+rr);
//
//				}
//
//			}
//
//			//@Test
//
//			public void mapToList() {//**************map to list convert
//
//				Map<Integer,String> map=new HashMap<Integer,String>();
//
//				map.put(4, "cat");
//
//				map.put(5,"dog");
//
//				map.put(6, "cow");
//
//				Collection<String> st=map.values();
//
//				List<String>li=new ArrayList<String>(st);
//
//				for(String ss:li) {
//
//					System.out.println(ss);
//
//				}
//
//			}
//
//			//@Test //****************particular value exist from Hashtable
//
//			public void verifyElementExistInHashTable() {
//
//				Hashtable<Integer,String>htt=new Hashtable<Integer,String>();
//
//				htt.put(1, "aa");
//
//				htt.put(2, "ab");
//
//				htt.put(3, "ac");
//
//				htt.put(4, "ad");
//
//				Set<Integer>set=htt.keySet();
//
//				Iterator iterator=set.iterator();
//
//				while(iterator.hasNext()) {
//
//					System.out.println(iterator.next());
//
//				}
//
//				if(htt.contains("ac")){
//
//					System.out.println("yes");
//
//				}else {
//
//					System.out.println("no");
//
//				}
//
//				Enumeration enu=htt.keys();
//
//				while(enu.hasMoreElements()) {
//
//					System.out.println("enu:"+" "+enu.nextElement());
//
//				}
//
//			}
//
//			
//
//			@Test//************REMOVE DUPLICATE FROM ARRAYLIST
//
//			
//
//			public void reverseArrayList() {
//
//				List<String>li=Arrays.asList("asma","salma","ruma","salma");
//
//				
//
//			int size=li.size();
//
//			for(int i=size-1;i>=0;i--) {
//
//				System.out.print(li.get(i));
//
//				System.out.print(",");
//
//			}
//
//			
//
//			}
//
//				
//
//			
//
//			//@Test
//
//		
//
//	    public void getKeyValueFromHashTable() {//TAKE DATA FROM HASHTABLE
//
//				
//
//			
//
//		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
//
//		ht.put(1, "a");
//
//		ht.put(2, "ab");
//
//
//
//		ht.put(3, "aa");
//
//		ht.put(4, "ac");
//
//
//
//		Set<Integer>set=ht.keySet();
//
//		Iterator iterator=set.iterator();
//
//		while(iterator.hasNext()) {
//
//
//
//			System.out.println(iterator.next());
//
//		}
//
//		Enumeration enu=ht.keys();
//
//		ht.remove(3);
//
//		while(enu.hasMoreElements()) {
//
//		System.out.println("after remove:"+enu.nextElement());
//
//			}
//
//
//
//	}
//
//	  //REMOVE DUPLICATE FROM LIST
//
//	  	@Test
//
//	  	public void duplo() {
//
//	  	ArrayList<String>li=new ArrayList<String>();
//
//	  		li.add("asma");
//
//	  		li.add("salma");
//
//	  		li.add("ruma");
//
//	  		li.add("salma");
//
//	  		System.out.println("before remove:"+" "+li);
//
//	  		Set<String> set=new HashSet<String>(li);
//
//	  		for(String ss:set) {
//
//	  		System.out.println("set:"+ " "+ss);}
//
//	  		for(int i=0;i<li.size();i++) {
//
//	  			for(int j=i+1;j<li.size();j++) {
//
//	  				String a=li.get(i);
//
//	  				String a1=li.get(j);
//
//	  				if(a.equals(a1)) {
//
//	  					li.remove(a);
//
//	  					
//
//	  				}

	  			

	  		

	  		//System.out.println("after remove:"+li);

	  	


}
	

