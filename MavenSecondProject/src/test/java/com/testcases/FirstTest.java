package com.testcases;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(groups = "smoke")
	public void tc_1() {
		System.out.println("First Test case");
	}
	
	@Test(groups = "regression")
	public void tc_2() {
		System.out.println("Second Test case");
	}
	
	@Test(groups = "regression")
	public void tc_3() {
		System.out.println("Third Test case");
	}
}
