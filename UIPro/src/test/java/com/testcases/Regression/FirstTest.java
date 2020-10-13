package com.testcases.Regression;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(groups = {"regression"} )
	public void TC1() {
		System.setProperty("org.uncommons.reportng.title", "Automation Report");
		System.out.println("RegFirstTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	@Test(groups= {"regression","smoke"})
	public void TC2() {
		System.out.println("RegSecondTestCase");
		Assert.assertTrue(true);
	}
	@Test(groups= {"regression"})
	public void TC3() {
		System.out.println("RegThirdTestCase");
	}


}
