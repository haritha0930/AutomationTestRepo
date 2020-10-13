package com.testcases.Regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups = {"regression"} )
	public void TC7() {
		System.out.println("RegSeventhTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	
	@Test(groups = {"regression"} )
	public void TC8() {
		System.out.println("RegEighthTestCase");
	}
	
	@Test(groups= {"regression"})
	public void TC9() {
		System.out.println("RegninethTestCase");
	}
}
