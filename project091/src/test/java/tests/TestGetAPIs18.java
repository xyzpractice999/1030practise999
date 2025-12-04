package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestGetAPIs18 {

	@Test
	public void testListOfAllObjects() {
		
		RestAssured.baseURI="https://api.restful-api.dev/objects/7";
		RequestSpecification req=RestAssured.given();
		
		String data ="{\r\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2019,\r\n"
				+ "      \"price\": 2049.99,\r\n"
				+ "      \"CPU model\": \"Intel Core i9\",\r\n"
				+ "      \"Hard disk size\": \"1 TB\",\r\n"
				+ "      \"color\": \"silver\"\r\n"
				+ "   }\r\n"
				+ "}";
		
		Response res=req.put(data);	
		
		System.out.println(res.statusCode());
//		System.out.println(res.asString());
//		System.out.println(res.getHeaders());

	
	}
}
