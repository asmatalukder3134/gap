package gaps;

import org.testng.annotations.Test;

public class Odds {
	@Test
	public void oddTest() {
	
		int []ar= {1,2,3,4,5};
		int index=0;
		int size=ar.length;
		int odd[]=new int[ar.length];
		for(int i=0;i<size;i++) {
			if(ar[i]%2 !=0) {
			odd[index]=ar[i];
			index++;}
		}
		for(int j=0;j<odd.length;j++) {
			System.out.println(odd[j]);
		}
	}

}
