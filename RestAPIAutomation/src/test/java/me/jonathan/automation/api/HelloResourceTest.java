package me.jonathan.automation.api;

import me.jonathan.automation.api.common.Constants;

import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class HelloResourceTest {

	private final String apiAddress = Constants.APIAddress+"/rest/hello";
	@Test
	public void testMyResourceGet() {
		String response = RestAssured.get(apiAddress).asString();
		System.out.println(response);
	}
}
