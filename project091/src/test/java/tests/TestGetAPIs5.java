package tests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs5 {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects";
		RequestSpecification req=RestAssured.given();
		Response res=req.get();
		if(res.asString().contains("Google Pixel 6 Pro")) {
			System.out.println("passed");
		}else {
			System.out.println("Failed");
		}
		Assert.assertTrue(res.asString().contains("Google Pixel 6 Pro"));

		
	
	}
}
