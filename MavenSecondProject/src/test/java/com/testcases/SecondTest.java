package com.testcases;

import org.testng.annotations.Test;

public class SecondTest {

	@Test(groups = "smoke")
	public void tc_4() {
		System.out.println("ADDED ");
		System.out.println("Fourth Test case");
	}
	
	@Test(groups = "regression")
	public void tc_5() {
		System.out.println("Fifth Test case");
	}
	
	@Test(groups = "regression")
	public void tc_6() {
		System.out.println("Sixth Test case");
	}
}
