package com.testcases.Regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	@Test(groups = {"regression"} )
	public void TC4() {
		System.out.println("RegFourthTestCase");
		String expectedText ="Search";
		Assert.assertEquals("Search", expectedText);
	}
	@Test(groups = {"regression"} )
	public void TC5() {
		System.out.println("RegFifthTestCase");
	}
	@Test(groups = {"regression"} )
	public void TC6() {
		System.out.println("RegSixthTestCase");
	}

}
