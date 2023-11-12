package com.gap;

import org.testng.annotations.Test;

public class Pyramid {
	@Test
	public void pyramidPatterns() {
		for(int i=1;i<=10;i++) {
			for(int k=6 ;k>=i;k--) {
				//System.out.print(" ");//end space loop
			}for(int j=1;j<=i;j++) {
				//System.out.print("* "); //end j loop
			}
			//System.out.println();
		}
		
	}
	@Test
	public void Pyramids() {
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
			
			
		}
	}

}
