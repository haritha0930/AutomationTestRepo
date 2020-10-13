package com.testcases.Smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups= {"smoke"})
	public void TC7() {
		System.out.println("SmokeSeventhTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	@Test(groups= {"smoke"})
	public void TC8() {
		System.out.println("SmokeEighthTestCase");
	}
	@Test(groups= {"smoke"})
	public void TC9() {
		System.out.println("SmokeninethTestCase");
	}
}
