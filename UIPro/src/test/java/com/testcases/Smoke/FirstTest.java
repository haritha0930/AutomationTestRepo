package com.testcases.Smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	@Test(groups= {"smoke","regression"})
	public void TC1() {
		System.out.println("SmokeFirstTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	@Test(groups= {"smoke"})
	public void TC2() {
		System.out.println("SmokeSecondTestCase");
	}
	@Test(groups= {"smoke"})
	
	public void TC3() {
		System.out.println("SmokeThirdTestCase");
	}


}
