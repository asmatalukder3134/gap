package com.gap;

import org.testng.annotations.Test;
@Test
public class Overrides extends Cow{
	String ph;
	// @Test
	public void adds() {
	Cow c=new Cow();
	c.setPw("123");
	c.setUname("asma");
	System.out.println(c.getUname());
	System.out.println(c.getPw());

	}
	//@Test
	@Override
	public void eat() {
		String food="leaves";
		System.out.println("cow eat grass"+" "+"and"+" "+food);
		
	}
	@Test
@Override
	public void displayInformation() {
		Cow c=new Cow();
		c.displayInformation();
		System.out.println("address:"+" "+address);
		System.out.println("email:"+" "+email);
		System.out.println("ph"+""+ph);
	}
}
