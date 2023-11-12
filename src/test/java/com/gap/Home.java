package com.gap;

import org.testng.annotations.Test;

public class Home {
	@Test
	public void prime() {
		int num = 20;
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= i; j++) {
				if (j == i) {
					System.out.println("prime:" + i);
				} else if (i % j == 0) {
					break;

				}
			}

		}
	}
}
