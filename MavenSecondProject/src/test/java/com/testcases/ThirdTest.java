package com.testcases;

import org.testng.annotations.Test;

public class ThirdTest {
	@Test(groups = "smoke")
	public void tc_7() {
		System.out.println("Seventh Test case");
	}
	
	@Test(groups = "regression")
	public void tc_8() {
		System.out.println("Eighth Test case");
	}
	
	@Test(groups = "regression")
	public void tc_9() {
		System.out.println("Ninth Test case");
	}
}
