package com.testcases.Smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	@Test(groups= {"smoke"})
	public void TC4() {
		System.out.println("SmokeFourthTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	@Test(groups= {"smoke"})
	public void TC5() {
		System.out.println("SmokeFifthTestCase");
	}
	
	@Test(groups= {"smoke"})
	
	public void TC6() {
		System.out.println("SmokeSixthTestCase");
	}

}
