package newPackage;

import org.testng.annotations.Test;

public class DatasEvaluation {
	//@Test
	public static void main(String[]args) {
		int[]ar= {2,5,4,3,6,7,8,9,4,2};
		int size=ar.length;
		int even[]=new int[size];
		int odd[]=new int[size];
		int cc[]=new int[size];
		int index=0;
		for(int i=0;i<size;i++) {
			if(ar[i]%2==0) {
				
			
			even[index]=ar[i];
			index++;
		}}
		System.out.println("even"+even);
		for(int j=0;j<size;j++) {
			if(ar[j]%2!=0) {
			odd[index]=ar[j];
			index++;
		}
			System.out.println("odd:"+odd);}
		for(int k=0;k<size;k++) {
			System.out.println(cc[k]);
		}
	}

}
