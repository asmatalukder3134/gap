package com.gap;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;

//*******************reverse a String
	// public static void main(String[] args) {
//		int a=2;
//		int b=5;
//		int c=a+b;
//		//System.out.println(c);

//	String name="asma";
//	char[]ch=name.toCharArray();
//	int size=ch.length;
//	String rev="";
//	for(int i=size-1;i>=0;i--) {
//		System.out.print(ch[i]+rev);
//		//
//		System.out.print("");
	// }

	public static void ain(String[] args) {
		int num = 123;
		// int rev=0;
		int sum = 0;
		int digit;
		while (num > 0) {
			digit = num % 10;
			// rev=digit+rev*10;
			sum = sum + digit; // **************SUM OF DIGIT
			num = num / 10;

		}
		// System.out.println(rev);
		// System.out.println(sum);
	}

	public static void mai(String[] args) {
		// *******************VOWEL IN STRING
		String name = "asmuie";
		char[] ch = name.toCharArray();
		int size = ch.length;
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
				System.out.println(ch[i]);

			}
			System.out.println("count:" + count);
		}

	}

	public static void min(String[] args) {
		 int num=20;
		for (int i = 2; i <=num; i++) {
			for (int j = 2; j <=i; j++) {
				if (j == i) {
					 System.out.println("prime:"+i);
				} else if (j % i == 0) {
					break;
					
				}
			}
		}

	}

	// ************************FEBONACCI NUMBER
	public static void man(String[] args) {
		int febo1 = 1, febo2 = 1, febonacci = 1;
		for (int i = 0; i < 8; i++) {
			febonacci = febo1 + febo2;
			febo1 = febo2;
			febo2 = febonacci;

		}
		// System.out.println(febonacci);
	}

	// **************CONTAIN ODD NUMBER
	public static void m(String[] args) {

		int num[] = { 2, 3, 4, 5, 6, 7, 8 };
		int size = num.length;
		for (int i = 0; i < size; i++) {
			if (i % 2 != 0) {
				// System.out.println("odd are:"+num[i]);
			}
		}
	}
//********************STRING PALINDROME
	public static void n(String[] args) {
		String name = "mum";
		String rev = "";
		char[] ch = name.toCharArray();
		int size = ch.length;
		for (int i = size - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}
		if (rev.equals(name)) {
			System.out.println("palin");
		} else {
			System.out.println("not palin");
		}
	}
	//******************reverse int
	public static void a(String[] args) {
	int num=123;
	int digit;
	//int rev=0;
	int sum=0;
	while(num>0) {
		digit=num%10;
		//rev =digit+rev*10;
		sum=digit+sum;
		num=num/10;
	}//System.out.println(rev);
	System.out.println(sum);
	}
	//********************************SPACE RMOVE IN STRING
	public static void i(String[] args) {
		String name="asma *talukder%&";
		//String n=name.strip();
		//String n=name.trim();
		String n=name.stripTrailing();
		//String neo=name.replace(" ", "");
		System.out.println(n);
	
	}
	//******************SORT AN ARRAY
	public static void ma(String[] args) {
		int[]ar= {2,3,4,5,67,88,99,15,11,3,1};
	Arrays.sort(ar);
	System.out.println(Arrays.toString(ar));
	}
	//**************FACTORIAL NUMBER
	public static void ai(String[] args) {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		//System.out.println(fact);
	}
	//***************
	public static void main(String[] args) {
		int[]a= {1,2,3};
		int size1=a.length;
		int[]b= {3,4,5};
		int size2=b.length;
		int c[]=new int[size1+size2];
		int size3=c.length;
		int index=0;
		for(int i=0;i<size1;i++) {
			
			 c[index]=a[i];
			 index++;
			
		}
		for(int j=0;j<size2;j++) {
			
			c[index]=b[j];
			index++;
		}
		for(int k=0;k<size3;k++) {
			index++;
			
			//System.out.println(c[k]);
		}
	}
	//@Test
	public void run() {
	 List<String>li=Arrays.asList("asma","salma","runa");
	 int size=li.size();
	// String rev="";
	 for(int i=size-1;i>=0;i--) {
		 System.out.print(li.get(i));
		 System.out.print(" ");   
		 
	 }
	}
	@Test
	public void openBrow() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("current url is :"+" "+url);
		WebElement dropButton=driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
	Select s=new Select(dropButton);
	s.selectByVisibleText("Option1");
}
}