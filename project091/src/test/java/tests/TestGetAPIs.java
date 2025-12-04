package tests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects";
		RequestSpecification req=RestAssured.given();
		Response res=req.get();
		System.out.println(res.statusCode());
		System.out.println(res.getTime());
		System.out.println(res.asString());
		System.out.println(res.headers());
		System.out.println(res.cookies());
		
	
	}
}
