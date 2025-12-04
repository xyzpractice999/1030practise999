package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs9 {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects";
		RequestSpecification req=RestAssured.given();
		
		Map<String, String> header=new HashMap<String, String>();
		header.put("x-api-key", "YOUR_API_KEY");
		//header.put("Authorization", "Bearer dfda68f7ad8f79d8g9ds8g0s09g0fs9g0fg9f9g9f97");
		req.headers(header);
		Response res=req.get();	
		
		System.out.println(res.statusCode());
		System.out.println(res.time());
		System.out.println(res.asString());
		System.out.println(res.getHeaders());
		System.out.println(res.cookies());
	
	}
}
