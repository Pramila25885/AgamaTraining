package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {

	@Test(description="Login OrangeHRM")
	public void Login() {
		System.out.println("test case login");

	}

	@Test(dependsOnMethods = "Login")
	public void search() {
		System.out.println("test case search");
		Assert.assertEquals("XYZ", "abc");
	}

	@Test(dependsOnMethods = "search", alwaysRun = false)
	public void Logout() {
		System.out.println("test case logout");
	}
}
