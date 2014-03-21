package me.jonathan.automation.api;

import me.jonathan.automation.api.common.Constants;

import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class HelloResourceTest {

	@Test
	public void testMyResourceGet() {
		String response = RestAssured.get(Constants.APIAddress+"/hello").asString();
		System.out.println(response);
	}
}
