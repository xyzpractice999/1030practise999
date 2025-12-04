package tests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs4 {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects";
		RequestSpecification req=RestAssured.given();
		Response res=req.get();
		System.out.println(res.getTime());
		Assert.assertTrue(res.getTime()<2000);
	
		
	
	}
}
