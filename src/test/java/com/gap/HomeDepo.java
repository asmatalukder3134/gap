package com.gap;

import java.util.Arrays;
import java.util.List;

public class HomeDepo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=Arrays.asList("asma","salma","lima");
		li.add("suma");
		li.add("ruma");
		li.add("roma");
		int size=li.size();
		for(int i=size-1;i>=0;i--) {
			System.out.print(li.get(i));
			System.out.print(",");
		}

	}

}
