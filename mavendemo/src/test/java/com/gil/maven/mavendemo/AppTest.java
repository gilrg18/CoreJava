package com.gil.maven.mavendemo;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	//Junit test
	@Test
	public void givenANameWhenHelloThenReturnHelloName() {
		App app = new App();
		String result = app.hello("Gil");
		Assert.assertNotNull(result);
		//Assert for a particular value that you are expecting
		Assert.assertEquals("Hello Gil", result);
	}
}
