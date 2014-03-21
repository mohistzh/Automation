package me.jonathan.automation.api;

import me.jonathan.automation.api.common.Constants;

import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class AccountResourceTest {

	@Test
	public void testGetAccountById() {
		System.out.println("-----------testAccountResourceTest-----------");
		String response = RestAssured.get(Constants.APIAddress+"/account/1").asString();
		System.out.println(response);
	}
	@Test
	public void testGetAccounts() {
		System.out.println("-----------testGetAccounts-----------");
		String response = RestAssured.get(Constants.APIAddress+"/account").asString();
		System.out.println(response);
	}
}
